package OOPS;
import java.util.Scanner;
class square
{
	public void displaysquare(int n)
	{
		System.out.println("Square of "+n+":" + n*n);
	}
}
class cube
{
	public void displaycube(int n)
	{
		System.out.println("Cube of "+n+": "+ n*n*n);
	}
}
public class number
{
	private static Scanner read;

	public static void main(String[] args)
	{
		read = new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n=read.nextInt();
		square s= new square();
		s.displaysquare(n);
		cube c= new cube();
		c.displaycube(n);
	}
}
