package CO2;
import java.util.*;
public class searchArray
{
	public static void main(String [] args)
	{
		int a[]=new int[10];
		int flag=0,n,i,key;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=r.nextInt();
		System.out.println("Enter the elements");
		for (i=0;i<n;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Enter the number to search");
		key=r.nextInt();
		for (i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				System.out.println("Number found");
				flag=1;
				break;
			}	
		}
		if(flag==0)
		{
			System.out.println("Number not found");
		}
	}
}
