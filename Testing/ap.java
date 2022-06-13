
import java.util.Scanner;

interface shape
{
	double pi=3.14;
	void area();
	void perimeter();
}

class triangle implements shape
{
	double at,pt;
	int base,height;
	triangle()
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the base of the triangle");
		base = read.nextInt();
		System.out.println("Enter the height of the triangle");
		height = read.nextInt();
	}
	public void area()
	{
		at=((0.5)*base*height);
		System.out.println("Area of triangle: "+at);
	}
	public void perimeter()
	{
		System.out.println("Perimeter of triangle: "+(0.5));
	}
}
class circle implements shape
{
	Float r;
	double ac,pc;
	circle()
	{	Scanner sc=new Scanner(System.in);
		System.out.println("enter radius");
		r=sc.nextFloat();
	}
	public void area()
	{
		ac=pi*r*r;
		System.out.println("area is "+ac);
	}
	public void perimeter()
	{
		pc=2*pi*r;
		System.out.println("perimeter is "+pc);
		
	}
	
}

public class areaPerimeter {

	public static void main(String args[])
	{
		shape s;
		System.out.println("Triangle");
		triangle r=new triangle();
		s=r;
		s.area();
		s.perimeter();
		System.out.println("Circle");
		circle c=new circle();
		s=c;
		s.area();
		s.perimeter();
	}
}
