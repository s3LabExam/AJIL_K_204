import java.util.Scanner;
public class complexNo
{
	private static Scanner read;

	public static void main(String[] args)
	{
		read = new Scanner(System.in);
		System.out.println("Enter the 1st Complex Number");
		String c1=read.nextLine();
		String[] n1=c1.split("\\+");
		int r1 = Integer.parseInt(n1[0]);
		int i1=Integer.parseInt(n1[1].substring(0,(n1[1].length()-1)));
		System.out.println("Enter the 2nd Complex Number");
		String c2=read.nextLine();
		String[] n2=c2.split("\\+");
		int r2 = Integer.parseInt(n2[0]);
		int i2=Integer.parseInt(n2[1].substring(0,(n2[1].length()-1)));
		System.out.println("Sum of the two Complex Numbers is "+(r1+r2)+"+"+(i1+i2)+"i.");
	}
}
