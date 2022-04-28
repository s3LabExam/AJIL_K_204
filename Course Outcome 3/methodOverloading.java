import java.util.*;
public class methodOverloading
{
	public static double area(int r)
	{
		double a=(3.14*r*r);
		return a;
	}
	public static double area(int l,int b)
	{
		double a=(l*b);
		return a;
	}
	public static double area(int x,int y,int z)
	{
		double a=((0.5)*(x+y+z));
		return a;
	}
		public static void main(String[] args)
		{
			Scanner read = new Scanner(System.in);
			System.out.println("-----Area of Circle-----");
			System.out.println("Enter the radius: ");
			int r1=read.nextInt();
			System.out.println("Area: "+area(r1));
			System.out.println("-----Area of Rectangle-----");
			System.out.println("Enter the length: ");
			int l1=read.nextInt();
			System.out.println("Enter the breadth: ");
			int b1=read.nextInt();
			System.out.println("Area: "+area(l1,b1));
			System.out.println("-----Area of Triangle-----");
			System.out.println("Enter the First side: ");
			int s1=read.nextInt();
			System.out.println("Enter the Second side: ");
			int s2=read.nextInt();
			System.out.println("Enter the Third side: ");
			int s3=read.nextInt();
			System.out.println("Area: "+area(s1,s2,s3));
		}
}
