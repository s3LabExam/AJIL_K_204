import java.util.Scanner;

import graphics.shape.*;
public class area
{

	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the Length and breadth");
		
		int len=read.nextInt();
		int br=read.nextInt();
		int area=new rectangle(len,br);
	}

}
