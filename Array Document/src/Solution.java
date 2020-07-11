import java.util.*;
import java.util.Arrays;
public class Solution {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		char[] strarray= str.toCharArray();
		int sum=0;
		for(int i=0; i<strarray.length;i++)
		{
			int temp= str.charAt(i);
			sum= sum+ temp;
		}
		
		System.out.println(sum);
	}

}
