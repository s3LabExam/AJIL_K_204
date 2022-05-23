package OOPS;
import java.util.*;
class Books
{
	int bookId;
	String bookName;
	Scanner sc=new Scanner(System.in);
	Books()
	{
		System.out.println("Enter the bookid:");
		bookId=sc.nextInt();
		System.out.println("Enter the name of book:");
		bookName=sc.next();
		
	}
	
}
class Publisher extends Books
{
	String publisherName;
	String edition;
	Scanner sc=new Scanner(System.in);
	Publisher()
	{
		System.out.println("Enter the Publisher Name:");
		publisherName=sc.nextLine();
		System.out.println("Enter the edition:");
		edition=sc.next();
	}
}
class Fiction extends Publisher
{
	String author;
	String genere;
	int price;
	Scanner sc=new Scanner(System.in);
	Fiction()
	{
		super();
		System.out.println("Enter the author:");
		author=sc.nextLine();
		System.out.println("Enter the genere:");
		genere=sc.nextLine();
		System.out.println("Enter the price:");
		price=sc.nextInt();
	}
	void display()
	{
		System.out.println("-----THE FICTION BOOK DETAILS-----");
		System.out.println("The bookid is:"+bookId);
		System.out.println("The book name is:"+bookName);
		System.out.println("The publisher name is:"+publisherName);
		System.out.println("The edition is:"+edition);
		System.out.println("The author is:"+author);
		System.out.println("The  genere is:"+genere);
		System.out.println("The price is:"+price);
	}
}
class Literature extends Publisher
{
	String autho;
	String gener;
	int pric;
	Scanner sc=new Scanner(System.in);
	Literature()
	{
		super();
		System.out.println("Enter the author:");
		autho=sc.nextLine();
		System.out.println("Enter the genere:");
		gener=sc.nextLine();
		System.out.println("Enter the price:");
		pric=sc.nextInt();
	}
	void display()
	{
		System.out.println("-----THE LITERATURE BOOK DETAILS-----");
		System.out.println("The bookid is:"+bookId);
		System.out.println("The book name is:"+bookName);
		System.out.println("The publisher name is:"+publisherName);
		System.out.println("The edition is:"+edition);
		System.out.println("The author is:"+autho);
		System.out.println("The  genere is:"+gener);
		System.out.println("The price is:"+pric);
	}
}
class Book {
	public static void main(String[] args)
	{
		Fiction fict=new Fiction();
		Literature liter=new Literature();
		System.out.println("-----THE DETAILS OF BOOKS-----");
		fict.display();
		liter.display();
	}
}
