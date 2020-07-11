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
		};
		Library libres= sortLibraryById(lib);
		for(Library a:lib)
		{
			System.out.println(a.getId()+" "+a.getName()+" "+a.getAddress());
		}
		
	}

	private static Library sortLibraryById(Library[] lib) 
	{
		Library temp= null;
		for(int i=0; i<lib.length; i++)
		{
			for(int j=i+1; j<lib.length; j++)
			{
				if(lib[i].getId() > lib[j].getId())
				{
					temp= lib[i];
					lib[i]= lib[j];
					lib[j]= temp;
				}
			}
		}
		return temp;
	}

}
