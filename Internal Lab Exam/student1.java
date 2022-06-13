import java.util.*;
public class student1
{
	String na;
	int mk1,mk2,mk3,rn;
	student1(String name,int mark1,int mark2,int mark3, int rollno)
	{
		na=name;
		mk1=mark1;
		mk2=mark2;
		mk3=mark3;
		rn=rollno;
	}
	void display()
	{
		System.out.println("Name:"+na);
		System.out.println("Mark1:"+mk1);
		System.out.println("Mark2:"+mk2);
		System.out.println("Mark3:"+mk3);
		System.out.println("Mark4:"+rn);
	}
		
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = read.nextInt();
		student1 obj[]= new student1[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("------Enter the Details of Student "+(i+1)+"-----");
			System.out.println("Enter the name");
			String name=read.next();
			System.out.println("Enter the mark1");
			int mark1=read.nextInt();
			System.out.println("Enter the mark2");
			int mark2=read.nextInt();
			System.out.println("Enter the mark3");
			int mark3=read.nextInt();
			System.out.println("Enter the rollno");
			int rollno=read.nextInt();
			obj[i]=new student1(name,mark1,mark2,mark3,rollno);
		}
		System.out.println("-----Entered Details-----");
		for(int i=0;i<n;i++)
		{
			System.out.println("-----Student "+(i+1)+"-----");
			obj[i].display();
			System.out.println();
		}
	}
}
