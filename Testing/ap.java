package internalExam;
import java.util.*;
interface shape
{
	double pi=3.14;
	void triangle();
	void circle();
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
	double ac,pc;
	int radius;
	circle()
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		radius = read.nextInt();
	}
	public void area()
	{
		ac=(pi*radius*radius);
		System.out.println("Area of Circle: "+ac);
	}
	public void perimeter()
	{
		pc=(4*pi*radius);
		System.out.println("Perimeter of Circle: "+pc);
	}
}
public class areaPerimeter
{
	public static void main(String[] args)
	{
		interface s;
		System.out.println("-----Triangle-----");
		triangle t = new triangle();
		s1=t;
		t.area();
		t.perimeter();
		System.out.println("-----Circle-----");
		circle c = new circle();
		s=c;
		c.area();
		c.perimeter();
	}
}
