package internalExam;
import java.util.*;
public class student
{
	void student(String name,int mark1,int mark2,int mark3, int rollno)
	{
		super(name,mark1,mark2,mark3,rollno);
		
	}
	void display()
	{
		
	}
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = read.nextInt();
		student obj[]= new student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("------Enter the Details of Student "+(i+1)+"-----");
			System.out.println("Enter the name");
			String nam=read.next();
			System.out.println("Enter the mark1");
			int m1=read.nextInt();
			System.out.println("Enter the mark2");
			int m2=read.nextInt();
			System.out.println("Enter the mark3");
			int m3=read.nextInt();
			System.out.println("Enter the rollno");
			int roll=read.nextInt();
			obj[i]=read.student(nam,m1,m2,m3,roll);
		}
	}

}
