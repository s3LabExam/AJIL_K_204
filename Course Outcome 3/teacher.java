package OOPS;
import java.util.*;
class employee
{
	int empId;
	String empname;
	int empSalary;
	String empAddress;
	employee(int eId, String eName, int eSalary, String eAddress)
	{
		empId = eId;
		empname = eName;
		empSalary = eSalary;
		empAddress = eAddress;
	}
	
}
public class teacher extends employee
{
	String department;
	String subject;
	private static Scanner read;
	teacher(int eId, String eName, int eSalary, String eAddress, String edepartment, String esubject)
	{
		super(eId,eName,eSalary,eAddress);
		department = edepartment;
		subject = esubject;
	}
	void display()
	{
		System.out.println(empId);
		System.out.println(empname);
		System.out.println(empSalary);
		System.out.println(empAddress);
		System.out.println(department);
		System.out.println(subject);
	}
	public static void main(String[] args)
	{
		int n,i,id,salary;
		String name,address,dept,sub;
		teacher obj[]= new teacher[10];
		read = new Scanner(System.in);
		System.out.println("Enter the number of Teachers");
		n=read.nextInt();
		if(n>0)
		{
			System.out.println("-----Enter the Details-----");
			for(i=0;i<n;i++)
			{
				System.out.println("-----Teacher "+(i+1)+"-----");
				System.out.println("Enter the Employee Id");
				id=read.nextInt();
				System.out.println("Enter the Name");
				name=read.next();
				System.out.println("Enter the Salary");
				salary=read.nextInt();
				System.out.println("Enter the Address");
				address=read.next();
				System.out.println("Enter the Department Name");
				dept=read.next();
				System.out.println("Enter the Subject");
				sub=read.next();
				obj[i]= new teacher(id,name,salary,address,dept,sub);
				System.out.println();
			}
			System.out.println("-----Entered Details-----");
			for(i=0;i<n;i++)
			{
				System.out.println("-----Teacher "+(i+1)+"-----");
				obj[i].display();
				System.out.println();
			}
		}
		else
		{
			System.out.println("Enter valid input.");
		}
	}
}
