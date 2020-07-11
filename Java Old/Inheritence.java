
import java.util.*;

class Product{
    int pid;
    String name;
    int price;

    Product() {
        System.out.println("dwbiywdhqbwckh0");
    }
    //Writing data into product
    void setProductDetails(int pid, String name, int price)
    {
        this.pid= pid;
        this.name= name;
        this.price= price;
    }

    void showProductDetails()
    {
        System.out.println("----Product ID:"+pid);
        System.out.println("Name:"+name);
        System.out.println("Price:"+price;
    }

}

public class InheritenceApp
{
    public static void public static void main(String[] args) {
     
        Product product1= new Product();
        product1.setProductDetails(259, "iphone", 75000);
        Product product2= new Product();
        product2.setProductDetails(856, "mi", 8451);
        
    }
}