package tcs.ilp;
import java.util.*;

public class LibraryDemo {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		Library[] library= new Library[size];
		for (int i=0; i<size; i++)
		{
			int id= sc.nextInt(); sc.next();
			String name= sc.nextLine();
			String address= sc.nextLine();
			
			library[i]= new Library(id, name, address);
		}
		int bid= sc.nextInt();
		int idres= searchBookById(library, bid);
		System.out.println("Output after first search: "+idres);
	}

	private static int searchBookById(Library[] library, int bid)
	{
		int count= -1;
		for(int i=0; i<library.length; i++)
		{
			if(library[i].getId() == bid)
			{
				count = 1;
			}
			
		}
		return count;
	}

}
