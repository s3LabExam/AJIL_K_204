import java.util.*;
public class student
{
  public static void main(String[] args)
  {
	Scanner read= new Scanner(System.in);
	System.out.print("Enter the Roll No.: ");
	int rollno= read.nextInt();
	System.out.print("Enter the Name: ");
	String  name= read.next();
	System.out.print("Enter the Marks: ");
	int  marks= read.nextInt();
    System.out.println("-----Student Details-----\nName:"+name+"\nRoll No.:"+rollno+"\nMarks:"+marks);
  }
}
