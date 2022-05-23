package javaprgm;
import java.util.Scanner;
class  negativeException extends Exception
{  
    public  negativeException(int num)
    {  
        super(num);
    }  
}
public class avgPosNum
{
	static void checkNum (int num) throws  negativeException
	{   
	   if(num < 0)
	   {   
	       throw new negativeException(num+" is a negative number.");    
	   }  
	}    
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the limit:\t");
		int n,i,num,sum = 0;
		n = read.nextInt();
		for(i=0;i<n;i++)
		{
		   System.out.println("Enter the positive number:\t");
		   num = read.nextInt();
		   try
		   {
		     checkNum(num);
		   }
		   catch(negativeException ex)
		   {
		    		System.out.println("Caught the exception");  
		            System.out.println("Exception occured: " + ex);  
					i--;
					num = read.nextInt();
		    	 }
		    	sum=sum+num;  
		   }
		  System.out.println("Average:"+(sum/n));
	}
}
