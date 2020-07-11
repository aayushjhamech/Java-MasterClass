package tcs;
import java.util.*;
public class LibraryDemo {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		Library[] lib= new Library[size];
		for(int i=0; i<size; i++)
		{
			int id= sc.nextInt(); sc.next();
			String name= sc.nextLine();
			String address= sc.nextLine();
			
			lib[i] = new Library(id, name, address);
		}
		Library[] libres= sortLibrarybyName(lib);
		for(int i=0; i<lib.length;i++)
		{
			System.out.println(libres[i].getId()+" "+libres[i].getName()+" "+libres[i].getAddress());
		}

	}

	private static Library[] sortLibrarybyName(Library[] lib) 
	{
		Library[] temp = null;
		for(int i=0;i<lib.length; i++)
		{
			for(int j=i+1; j<lib.length; j++)
			{
				if(lib[i].getName().equals(lib[j].getName()))
					
				{
					break;
				}
				else
				{
					temp[i]= lib[i];
					lib[i]= lib[j];
					lib[j]= temp[i];
				}
				
			}
		}
		return temp;
	}

}
