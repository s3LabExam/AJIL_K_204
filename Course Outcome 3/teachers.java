import java.util.*;
public class person
{
	String name,gender,address;
	int age;
	person(String n,String g,String add,int a)
	{
		name = n;
		gender = g;
		age = a;	
	}
}
public class employee extends person
{
	int empId,salary;
	String company,qualification;
	employee(String name,String gender,String address,int age,int id,String c,String q,int s)
	{
		super(name,gender,address,age);
		empId = id;
		company = c;
		qualification = q;
		salary = s;
	}
}
public class teachers extends employee
{
	String subject,department;
	int teacherId;
	private static Scanner read;
	teachers(String name,String gender,String address,int age,int empId,String company,String qualification,int salary,String sub,String dept,int tId)
	{
		super(name,gender,address,age,empId,company,qualification,salary);
		subject=sub;
		department=dept;
		teacherId=tId;
	}
	public static void main(String[] args)
	{
		read = new Scanner(System.in);
		int i,no;
		teachers[] obj = new teachers[10];
		System.out.println("Enter the number of teachers");
		no = read.nextInt();
		for(i=0;i<no;i++)
		{
			System.out.println("-----Enter the details of teacher-----");
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
			obj[i]= new teachers(tname,tgen,tadd,tage,tempid,tcomp,tq,tsalary,tsub,tdept);
		}
	}

}
