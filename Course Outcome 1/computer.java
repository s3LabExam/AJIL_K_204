import java.util.Scanner;
class cpu
{
	int price;
	cpu(int cost)
	{
		price=cost;;
	}
	void display()
	{
		System.out.println("Price- "+price);
	}
	class processor
	{
		int core;
		String manufacturer;
		processor(int x,String s)
		{
			core=x;
			manufacturer=s;
		}
		void display()
		{
			System.out.println("Core- "+core+"\n"+"Manufacturer- "+manufacturer);
		}
	}
	static class ram
	{
		int memory;
		String manufacturer;
		ram(int x,String s)
		{
			memory=x;
			manufacturer=s;
		}
		void display()
		{
			System.out.println("Memory- "+memory+"GB\n"+"Manufacturer- "+manufacturer);
		}
	}
}
public class computer
{

	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the Price ");
		int pPrice=read.nextInt();
		cpu c=new cpu(pPrice);
		System.out.println("Enter the number of cores ");
		int pCore=read.nextInt();
		System.out.println("Enter the name of the manufacturer of CPU");
		String pMan=read.next();
		System.out.println("Enter the memory size ");
		int rMemory=read.nextInt();
		System.out.println("Enter the name of the manufacturer of RAM");
		String rMan=read.next();
		cpu.processor p= c.new processor(pCore,pMan);
		cpu.ram r=new cpu.ram(rMemory, rMan);
		c.display();
		p.display();
		r.display();
		System.out.println();

	}
}
