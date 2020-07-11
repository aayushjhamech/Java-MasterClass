package ilp;
import java.util.*;
public class LibraryDemo {

	public static void main(String[] args) throws Exception
	{	
		Library[] lib= new Library[4];
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<lib.length;i++)
		{
			int id= sc.nextInt();
			String name= sc.nextLine();
			String address= sc.nextLine();
			
			lib[i]= new Library(id, name, address);
 		}

	}

}
