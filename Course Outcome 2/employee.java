import java.util.*;
class employees
{
	int empNo;
	String empName;
	Double empSalary;
	employees(int a,String b,Double c)
	{
		empNo=a;
		empName=b;
		empSalary=c;
	}
}
public class employee
{
	public static void main(String[] args)
	{
		int i=0,flag=0,id,key;
		String name;
		Double salary;
		employees obj[]=new employees[10];
		System.out.println("Enter the number of Employees");
		Scanner r=new Scanner(System.in);
		int n=r.nextInt();
		while(i<n)
		{
			System.out.println("Enter Employee ID");
			id=r.nextInt();
			System.out.println("Enter Employee Name");
			r.nextLine();
			name=r.nextLine();
			System.out.println("Enter Employee Salary");
			salary=r.nextDouble();
			obj[i]=new employees(id,name,salary);
			i++;
		}
		System.out.println("Enter Employee ID to search details");
		key=r.nextInt();
		i=0;
		while(i<n)
		{
			if(obj[i].empNo==key)
			{
				System.out.println("Employee Found");
				System.out.println("Employee No : "+obj[i].empNo+"\nEmployee Name : "+obj[i].empName+"\nEmployee Salary : "+obj[i].empSalary);
				flag=1;
			}
			i++;
		}
		if(flag==0)
		{
			System.out.println("Employee Not Found");
		}
	}
}