import java.util.*;
import java.lang.*;

class Solution {

	public static void main(String[] args) {
	
			Scanner sc= new Scanner(System.in);
			int n= sc.nextInt();
			int num;
			for(int i=0; i<n; i++)
			{
				num= sc.nextInt();
			}
			sc.close();
			
			int k=0, sum=0;

				if(Math.pow(5, k) < n)
				{
					k++;
				}
		
			for(int j=1; j<=k; j++)
			{
				sum+= n/(Math.pow(5, j));
			}
				
			System.out.println(sum);
			
	}

}
