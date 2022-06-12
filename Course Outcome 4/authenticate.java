package javaprgm;
import java.util.*;
class AuthenticationException extends Exception
{
	public AuthenticationException(String str)
	{
		System.out.println(str);
	}	
}
public class authenticate
{
	public static void main(String[] args)
	{
		try
		{
			Scanner read = new Scanner(System.in);
			System.out.println("Enter the username: ");
			String uname = read.nextLine();
			System.out.println("Enter the password: ");
			String pass = read.nextLine();
			if(uname.equals("varun123") && pass.equals("Varun@123"))
			{
				System.out.println("Authentication Successfull.");
			}
			else
			{
				throw new AuthenticationException("Authentication Failed.");
			}
		}
		catch(AuthenticationException a)
		{
			System.out.println(a);
		}
	}

}
