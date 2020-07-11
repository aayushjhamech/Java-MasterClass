package tcs;
import java.util.*;
public class Solution {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		Cars[] cars= new Cars[size];
		for(int i=0; i<cars.length;i++)
		{
			int id= sc.nextInt(); sc.next();
			String name= sc.nextLine();
			String fuel= sc.nextLine();
			int mill= sc.nextInt();
			
			cars[i]= new Cars(id, name, fuel, mill);
		}
		
		String f= sc.next();
		Cars[] carres= sortByMill(cars, f);
		for(Cars a:carres)
		{
			System.out.println(a.getId()+" "+a.getFuel()+" "+a.getMill());
		}
	}

	private static Cars[] sortByMill(Cars[] cars, String f) 
	{
		int size=0;
		for(int i=0; i<cars.length; i++)
		{
			if(cars[i].getFuel().equals(f))
			{
				size++;
			}
		}
		
		int x=0;
		Cars[] temp= new Cars[size];
		for(int i=0; i<cars.length; i++)
		{
			if(cars[i].getFuel().equals(f))
			{
				temp[x]= cars[i];
				x++;
			}
		}
		
		Cars t;
		for(int i=0; i<temp.length; i++)
		{
			for(int j=i+1; j<temp.length; j++)
			{
				if(temp[i].getMill()>temp[j].getMill())
				{
					t= temp[i];
					temp[i]= temp[j];
					temp[j]= t;
				}
			}
		}
		return temp;
	}

}
