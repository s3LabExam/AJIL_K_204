package graphics;
interface figures
{
	void rectangle(int l,int b);
	void triangle(int b,int h);
	void square(int a);
	void circle(int r);
}
public class shape implements figures
{
	public void rectangle(int l,int b)
	{
		System.out.println("Area of Rectangle: "+l*b);
	}
	public void triangle(int b,int h)
	{
		System.out.println("Area of Triangle: "+(0.5)*b*h);
	}
	public void square(int a)
	{
		System.out.println("Area of Square: "+a*a);
	}
	public void circle(int r)
	{
		System.out.println("Area of Circle: "+(3.14)*r*r);
	}
}
