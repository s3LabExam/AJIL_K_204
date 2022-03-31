import java.util.Scanner;
public class complexNo
{
	int r1,r2;
	String i1,i2;
	public void getData()
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the real part of the Complex Number");
		this.r1=read.nextInt();
		read.nextLine();
		System.out.println("Enter the imaginary part of the Complex Number");
		this.i1=read.nextLine();
	}
	public void printData()
	{
		System.out.println("The Complex Number:"+this.r1+"+"+this.i1);
	}
	public static void main(String[] args)
	{
		complexNo c1= new complexNo();
		c1.getData();
		c1.printData();
		complexNo c2= new complexNo();
		c2.getData();
		c2.printData();
	}

}
