import java.io.*;
import java.util.*;
public class CandidateCode {
public static String winorlose(int[] str,int[] ene,int n)
{
int min1=str[0],y=0,x,c,k=0;
int[] s=new int[n];
for(int i=0;i<n;i++)
{
if(str[i]<min1)
{
min1=str[i];
}
}
for(int i=0;i<n;i++)
{
int min=min1;
for(int j=0;j<n;j++)
{
if(str[j]<ene[i] && min<=str[j])
{
min=str[j];
y=j;
}
}
str[y]=0;
s[k]=y;
k++;
}
for(int j=0;j<n;j++)
{
c=0;
for(int i=0;i<n;i++)
{
if(j==s[i])
c++;
}
if(c>1)
{
return "LOSE";
}
}
return "WIN";
}
public static void main(String args[] ) throws Exception {

Scanner sc=new Scanner(System.in);

int t=sc.nextInt();
while(t>0)
{
int n=sc.nextInt();
int[] str=new int[n];
int[] ene=new int[n];
for(int i=0;i<n;i++)
{
str[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
ene[i]=sc.nextInt();
}
System.out.println(winorlose(str,ene,n));
t=t-1;
}

}
}