package OOPS;
import java.util.Scanner;
class Sports
{
    String sport;
    double rating;
    Sports(String s, double r)
    {
        sport = s;
        rating = r;
    }

}
class Student extends Sports
{
    String grade;
    double overallPer;
    Student(String s, double r,String g, double p)
    {
        super(s, r);
        grade = g;
        overallPer = p;
    }
}
public class Result extends Student 
{
    Result(String s, double r,String g, double p)
    {
        super(s, r, g, p);
    }
    void display()
    {
    	System.out.println("*****Entered Details*****");
        System.out.println("-----Sports Details of Student-----");
        System.out.println("Sport :"+sport);
        System.out.println("Rating :"+rating);
        System.out.println("-----Academic Details of Student-----");
        System.out.println("Academic Grade :"+grade);
        System.out.println("Overall percentage :"+overallPer);
    }
    
    public static void main(String[] args)
    {
        Scanner read =new Scanner(System.in);
        System.out.println("-----Enter the Sports Details of Student-----");
        System.out.println("Sport Item: ");
        String si =read.next();
        System.out.println("Sport Rating  out of 10: ");
        double sr =read.nextDouble();
        System.out.println("-----Enter the Sports Details of Student-----");
        System.out.println("Academic Grade: ");
        String ag =read.next();
        System.out.println("Overall percentage: ");
        double op =read.nextDouble();
        read.close();
        Result obj= new Result(si,sr,ag,op);
        obj.display();
    }
}
