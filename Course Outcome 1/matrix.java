import java.util.*;
public class matrix {

	private static Scanner read;

	public static void main(String[] args)
	{
		int[][] a=new int[10][10];
		int[][] b=new int[10][10];
		int i,j;
		read = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int r = read.nextInt();
		System.out.println("Enter the number of columns:");
		int c = read.nextInt();
		System.out.println("Enter the elements in 1st matrix\n");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=read.nextInt();
			}
		}
		System.out.println("-----1st matrix-----\n");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("Enter the elements in 2nd matrix\n");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[i][j]=read.nextInt();
			}
		}
		System.out.println("-----2nd matrix-----\n");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("-----Resultant matrix-----\n");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(((a[i][j])+(b[i][j]))+"\t");
			}
			System.out.print("\n");
		}
	}

}
