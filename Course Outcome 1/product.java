import java.util.*;
public class product
{
  int pcode;
  String pname;
  int price;
private Scanner r;
  public void get()
  {
	  r = new Scanner(System.in);
	  System.out.print("Enter the Product id: ");
	  this.pcode= r.nextInt();
	  System.out.print("Enter the Product name: ");
	  this.pname= r.next();
	  System.out.print("Enter the Product Price: ");
	  this.price= r.nextInt();
  }
  public static void main(String[] args)
  {
    product item1 = new product();
    item1.get();
    System.out.println("Product Code: "+item1.pcode);
    System.out.println("Product Name: "+item1.pname );
    System.out.println("Price: "+item1.price);
    System.out.println("\n");
    product item2 = new product();
    item2.get();
    System.out.println("Product Code: "+item2.pcode);
    System.out.println("Product Name: "+item2.pname );
    System.out.println("Price: "+item2.price);
    System.out.println("\n");
    product item3 = new product();
    item3.get();
    System.out.println("Product Code: "+item3.pcode);
    System.out.println("Product Name: "+item3.pname );
    System.out.println("Price: "+item3.price);
    System.out.println("\n");
    if(item1.price<item2.price)
    {
    	if(item1.price<item3.price)
    	{
    		System.out.println(item1.pname+" is less expensive");
    	}
    	else
    	{
    		System.out.println(item3.pname+" is less expensive");
    	}
    }
    else
    {
    	if(item2.price<item3.price)
    	{
    		System.out.println(item2.pname+" is less expensive");
    	}
    	else
    	{
    		System.out.println(item3.pname+" is less expensive");
    	}
    }
  }
}
