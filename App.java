import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.xml.transform.Source;

public class App {

    static int rev=0;
    public static void main(String[] args) throws Exception {

        Scanner sc= new Scanner(System.in);

        // String str= sc.next();
        // int input= sc.nextInt();

        // String res= longestPalind(str);
        // Boolean res= palindrome(input);
        // System.out.println(res);

        //Sum of Max and Min in array
        // int n= sc.nextInt();//no of elements
        // int[] arrInt= new int[n];
        // for(int i=0; i<n; i++){
        //     arrInt[i]= sc.nextInt();
        // }

        // int sum= sumSubArray(arrInt);

        // int resMaxMin= maxMinSum(arrInt);
        // System.out.println(resMaxMin);


        //Reverse an array
        // System.out.println("Enter String for reversing: ");
        // String str= sc.next();
        // String recStr= reverse(str);
        // System.out.println(recStr);



        int n= sc.nextInt();//no of elements
        int[] arrInt= new int[n];
        for(int i=0; i<n; i++){
            arrInt[i]= sc.nextInt();
        }

        boolean res= duplicate(arrInt);
        System.out.println(res);



    }



        // ArrayList<Integer> lists= new ArrayList<>();
        // int n=sc.nextInt();
        

        // for(int i=0; i<n; i++){
        //     int x= sc.nextInt();
        //     lists.add(x);
        // }
        


        // for(int i:lists){
        //     System.out.println(i);
        // }

        // System.out.println(
        //     lists.stream()
        //     .min(Integer::compare).get()
        // );

        // int[] num= {};

        // OptionalInt x= IntStream.of(num).min();
        // System.out.println(x);



    
    
    private static boolean duplicate(int[] arrInt) {
        boolean res= false;
        int count=0;
        for(int i=0; i<arrInt.length;i++){
            for(int j=i+1; j<arrInt.length; j++){
                if(arrInt[i]==arrInt[j]){
                    count++;
                }
            }
            if(count>=2){
                res=true;            }
        }
        return res;
    }



    //Kanade approach solution
    private static int sumSubArray(int[] arrInt) {
        int size= arrInt.length;
        int maxSum= Integer.MIN_VALUE;
        int currSum= 0;
        for(int i=0; i<size; i++){
            if(currSum>=0){
                currSum= currSum+arrInt[i];
            }
            else{
                currSum=arrInt[i];
            }
            if(currSum>maxSum){
                maxSum= currSum;
            }
            
        }
        return maxSum;
    }



    //Reverse a string
    private static String reverse(String str) {
        char[] ch= str.toCharArray();
        int len= ch.length-1;
        for(int i=0; i<ch.length/2; i++){
            char temp= ch[len-i];
            System.out.println(temp);
            ch[len-i]= ch[i];
            ch[i]= temp;
        }
        // char[] resChar= new char[ch.length];
        // for(int i=len; i>=0;i--){
        //     for(int j=0; j<len+1; j++){
        //         resChar[j]= ch[i];
        //     }
        // }
        String res= String.valueOf(ch);
        return res;
    }


    //Sum of Max and Min in array
    private static int maxMinSum(int[] arrInt) {

        int len= arrInt.length;
        Arrays.sort(arrInt);    
        int min= arrInt[0];
        int max= arrInt[len-1];
        // int max=Integer.MIN_VALUE, min= Integer.MAX_VALUE;
        // for(int i=0; i<arrInt.length;i++){
        //     if(arrInt[i]>arrInt[i+1]){
        //         int temp= arrInt[i];
        //         arrInt[i]= arrInt[i+1];
        //         arrInt[i+1]= temp;
        //     }
        // }

        return min+max;
    }


    //  LEETCODE Problem No. 9-> Check palindrome        
    private static Boolean palindrome(int input) {
        reverse(input);
        int temp =rev;
        if(temp==input){
            return true;
        }
        return false;
    }


        //  LEETCODE Problem No. 5-> Longest Substring palindrome
    public static String longestPalind(String s){
        String ans = "";
    
        for(int i=0; i<s.length(); i++){
            int low = i, high = i;
            while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
                if(ans.length() < high-low+1){
                    ans = s.substring(low, high+1);
                }
                low--;
                high++;
            }
            low = i;
            high = i+1;
            while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
                if(ans.length() < high-low+1){
                    ans = s.substring(low, high+1);
                }
                low--;
                high++;
            }
        }
        return ans;        
    }


    public static void reverse(int n){
        if(n<=0)
            return ;

        int rem= n%10;
        rev= (rev*10)+ rem;
        reverse(n/10);
    }
    
}