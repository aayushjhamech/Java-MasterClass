package com;
public class CustomerDemo 
{
	public static void main(String[] args)
    {
     
        // TODO code application logic here
        
        Customer a1=new Customer(1,"aaa","m",45);
         Customer a2=new Customer(2,"bbb","f",54);
          Customer a3=new Customer(3,"ccc","m",26);
           Customer a4=new Customer(4,"ddd","f",31);
           Customer arr[]={a1,a2,a3,a4};
           
           
           
           Customer[] cc1=findAverageAgeMax(arr);
           for(Customer q:cc1)
           {
        System.out.println(q.getCustId()+"  "+q.getCustName()+" "+q.getGender()+"   "+q.getAge());
    }
           
    }
    
    
    public static double averageAge(Customer [] c){
        double sum=0;
        for(int i=0;i<c.length;i++)
        {
        sum=sum+c[i].getAge();
        
        }
        double avg=sum/c.length;
        return avg;
    }
    
    public static Customer[] findAverageAgeMax(Customer [] c)
    {
        int count=0;
        for(int i=0;i<c.length;i++){
        if(c[i]!=null){
        if(c[i].getAge()>averageAge(c))
        {
        count++;
        	}
        }
       }
        int x=0;
      Customer newc[]=new Customer[count];
      for(int j=0;j<c.length;j++){
          
          if(c[j].getAge()>averageAge(c))
          {
              newc[x++]=c[j];
          }
          
      
      }
      
        
        return newc;
    
    }
  }