package javaprgm;
import java.util.Scanner;
class NegativeNoException extends Exception
{
	public NegativeNoException(String str)
	{
		System.out.println(str);
	}	
}
public class avgPosNum
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the limit:\t");
		int n,i,sum = 0;
		n = read.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the number");
			String no = read.next();
			int num = Integer.parseInt(no);
			try
			{
				if(num < 0)
				{
					throw new NegativeNoException("Number is negative");
				}
				else
				{
					sum=sum+num;
				}
			}
			catch (NegativeNoException m)
			{
				System.out.println(m);
				i--;
			}
		}
		System.out.println("SUM "+sum);
	}
}
