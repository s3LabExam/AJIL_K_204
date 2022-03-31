import java.util.*;
public class symmetricMatrix
{
	private static Scanner read;
	public static void main(String[] args)
	{
		read = new Scanner(System.in);
		int[][] a= new int [10][10];
		int[][] b= new int [10][10];
		int r,c,i,j;
		System.out.println("Enter the number of rows:");
		r= read.nextInt();
		System.out.println("Enter the number of columns:");
		c= read.nextInt();
		if(r==c)
		{
			System.out.println("Enter the elements in the matrix:");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					a[i][j]=read.nextInt();
				}
			}
			System.out.println("Entered matrix:");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					System.out.print(a[i][j]+"\t");
				}
				System.out.print("\n");
			}
			System.out.println("Transpose of the matrix:");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					System.out.print(a[j][i]+"\t");
				}
				System.out.print("\n");
			}
			int flag=0;
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					if(a[i][j]!=a[j][i])
					{
						flag=1;
					}
				}
			}
			if(flag==0)
			{
				System.out.println("The entered matrix is a symmetric matrix.");
			}
			else
			{
				System.out.println("The entered matrix is not a symmetric matrix.");
			}
		}
		else
		{
			System.out.println("Only square matrix can be used.");
		}
	}
}