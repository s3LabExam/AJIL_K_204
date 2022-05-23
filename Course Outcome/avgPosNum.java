package javaprgm;
import java.util.Scanner;
public class avgPosNum
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the limit:\t");
		int n,i,num, sum = 0;
		n = read.nextInt();
		
		  
		      for(i=0;i<n;i++)
		      {
		    	 System.out.println("Enter the positive number:\t");
		    	 num = read.nextInt();
		    	 try
		  		 {
		    		 if(num<0);
		  		 }
		    	 catch
		    	 {
					System.out.println(e);
					i--;
					num = read.nextInt();
		    	 }
		      }
		      System.out.println("Average:"+(sum/n));
	}
}
