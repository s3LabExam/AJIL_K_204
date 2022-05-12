package javaprgm;
import java.util.*;
class Person
{
	String name,gender,address;
	int age;
	Person(String n,String g,String add,int a)
	{
		name = n;
		gender = g;
		address = add;
		age = a;	
	}
}
class Employees extends Person
{
	int empId,salary;
	String company,qualification;
	Employees(String name,String gender,String address,int age,int id,String c,String q,int s)
	{
		super(name,gender,address,age);
		empId = id;
		company = c;
		qualification = q;
		salary = s;
	}
}
public class Teachers extends Employees
{
	String subject,department;
	int teacherId;
	private static Scanner read;
	Teachers(String name,String gender,String address,int age,int empId,String company,String qualification,int salary,String sub,String dept,int tId)
	{
		super(name,gender,address,age,empId,company,qualification,salary);
		subject=sub;
		department=dept;
		teacherId=tId;
	}
	void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Address: " + address);
		System.out.println("Age: " + age);
		System.out.println("Employee Id: "+ empId);
		System.out.println("Company Name: " + company);
		System.out.println("Qualification: " + qualification);
		System.out.println("Salary: " + salary);
		System.out.println("Subject: " + subject);
		System.out.println("Department: " + department);
		System.out.println("Teacher Id: " + teacherId);
	}
	public static void main(String[] args)
	{
		read = new Scanner(System.in);
		int i,no;
		Teachers obj[] = new Teachers[10];
		System.out.println("Enter the number of teachers");
		no = read.nextInt();
		for(i=0;i<no;i++)
		{
			System.out.println("-----Enter the details of teacher "+(i+1)+"-----");
			System.out.println("Name:");
			String tname = read.next();
			System.out.println("Gender");
			String tgen = read.next();
			System.out.println("Address");
			String tadd = read.next();
			System.out.println("Age");
			int tage = read.nextInt();
			System.out.println("Employee Id");
			int tempid = read.nextInt();
			System.out.println("Company Name");
			String tcomp = read.next();
			System.out.println("Qualification");
			String tq = read.next();
			System.out.println("Salary");
			int tsalary = read.nextInt();
			System.out.println("Subject");
			String tsub = read.next();
			System.out.println("Department");
			String tdept = read.next();
			System.out.println("Teacher Id");
			int tId= read.nextInt();
			obj[i]= new Teachers(tname,tgen,tadd,tage,tempid,tcomp,tq,tsalary,tsub,tdept,tId);
		}
		for(i=0;i<no;i++)
		{
			System.out.println("-----Details of Teacher "+(i+1)+"-----");
			obj[i].display();
		}
	}
}
