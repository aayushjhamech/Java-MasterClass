package tcs;
import java.util.*;

public class LibraryDemo {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		Library[] library= new Library[size];
		for(int i=0; i<size; i++)
		{
			int id= sc.nextInt(); sc.next();
			String name= sc.nextLine();
			String address= sc.nextLine();
			
			library[i]= new Library(id, name, address);
		}
		
		Library library1= new Library(47, "knwqd", "diuhyd"); 
		boolean result1= replaceLibraryById(library, library1);
		System.out.println("Output for performing replace on libraryRes1 is: "+ result1  );
		
		for(Library a:library)
		{
			System.out.println(a.getId()+ " " +a.getName()+ " " +a.getAddress());
		}
		
		Library library2= new Library(53, "knwqd", "diuhyd"); 
		boolean result2= replaceLibraryById(library, library2);
		System.out.println("Output for performing replace on libraryRes1 is: "+ result2);
		
		for(Library a:library)
		{
			System.out.println(a.getId()+ " " +a.getName()+ " " +a.getAddress());
		}
		
		
		
		
	}

	private static boolean replaceLibraryById(Library[] library, Library library1) 
	{
		boolean str= false;
		for(int i=0; i<library.length; i++)
		{
			if(library[i].getId()== library1.getId());
			{
				for(int j=i+1; j<library.length; j++)
				{
					library[i].getName().equals(library1.getName());
					library[i].getAddress().equals(library1.getAddress());
				}
				str= true;
			}
		}
		
		return str;
	}

}
