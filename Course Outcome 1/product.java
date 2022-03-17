import java.util.*;
public class product
{
  int pcode;
  String pname;
  int price;
  public void get()
  {
	  System.out.print("Enter the Product id: ");
	  Scanner read1= new Scanner(System.in);
	  this.pcode= read1.nextInt();
	  System.out.print("Enter the Product name: ");
	  Scanner read2= new Scanner(System.in);
	  this.pname= read2.nextLine();
	  System.out.print("Enter the Product Price: ");
	  Scanner read3= new Scanner(System.in);
	  this.price= read3.nextInt();
  }
  public static void main(String[] args)
  {
    product item = new product();
    item.get();
    System.out.println("Product Code: "+item.pcode);
    System.out.println("Product Name: "+item.pname );
    System.out.println("Price: "+item.price);
  }
}
