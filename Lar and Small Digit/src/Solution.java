import java.util.*;
public class Solution {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int small= 10, large= 0, digit;
		if(num==0)
		{
			small= 0;
			large=0;
		}
		else if(num != 0)
		{
			while(num>0)
			{
				digit= num%10;
						if(small>digit)
							small= digit;
				
				if(large<digit)
					large=digit;
				else if(digit== 0)
					small=0;
				
				num=num/10;
			}
		}
		System.out.println(large+" "+small);
			

	}

}
