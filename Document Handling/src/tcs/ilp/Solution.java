package tcs.ilp;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		Book[] books= new Book[5];
		
		for(int i=0; i<books.length; i++)
		{
			int id= sc.nextInt();
			String title= sc.nextLine();
			String author= sc.nextLine();
			int price= sc.nextInt();
			
			books[i]= new Book(id, title, author, price);
		}
		
		Book[] bookRes= sortBooksbyPrice(books);
		for(Book b:bookRes)
		{
			System.out.println(b.getId()+" "+b.getTitle()+" "+b.getAuthor()+" "+b.getPrice());
		}
		
	}
	
	public static Book[] sortBooksbyPrice(Book[] books)
	{
		for(int i=0;i<books.length; i++)
		{
			for(int j=i+1; j<books.length; j++)
			{
				if(books[i].getPrice()>books[j].getPrice())
				{
					 Book temp = books[i];
					 books[i]=books[j];
					 books[j]= temp;
				}
			}
		}
		return books;
	}

}
