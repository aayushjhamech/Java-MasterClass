import java.util.*;
public class Solution {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		char large= 'A';
		char small= 'z';
		char[] strarray= str.toCharArray();
		for(int i=0; i<strarray.length; i++)
		{
			if(large<strarray[i])
			{
				large= strarray[i];
			}
			if(small>strarray[i])
			{
				small= strarray[i];
			}
		}
		System.out.println(large+""+small);
		sc.close();
	}

}
