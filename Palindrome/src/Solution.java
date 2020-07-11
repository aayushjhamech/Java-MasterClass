import java.util.Scanner;

public class Solution {

    public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
            int x = 0; 
            String s1 = null;
            System.out.printf("================================");
            
            for(int i=0;i<3;i++)
            {
               s1=sc.nextLine();
               x=sc.nextInt();
            }
            for(int i=0; i<3; i++)
            {
            	System.out.printf(s1 +" "+ x);
            }
            
            System.out.printf("=================================");

    }
}



