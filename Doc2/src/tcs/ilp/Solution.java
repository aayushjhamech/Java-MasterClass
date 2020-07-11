package tcs.ilp;
import java.util.*;
public class Solution {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Document[] doc= new Document[5];
		
		for(int i=0; i<doc.length; i++)
		{
			int id= sc.nextInt();
			String title= sc.nextLine();
			String folderName= sc.nextLine();
			int pages= sc.nextInt();
			
			doc[i]= new Document(id, title, folderName, pages);
		}
		
		Document[] docArray= docsWithOddPages(doc);
		for(Document d:docArray)
		{
			System.out.println(d.getId()+" "+d.getTitle()+" "+d.getFolderName()+" "+d.getPages());
		}

	}

	private static Document[] docsWithOddPages(Document[] doc)
	{
		boolean sign= false;
		for(int i=0; i<doc.length; i++)
		{
			if(doc[i].getPages()%2==1)
			{
				sign = true;
				break;
			}
		}
		return doc;
	}

}
