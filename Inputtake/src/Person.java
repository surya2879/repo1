import java.util.Scanner;
public class Person {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("----Enter Person details----");
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("enter age");
		int age=sc.nextInt();
	    System.out.println("enter address");
		sc.nextLine();
		String address=sc.nextLine();
		System.out.println("----Person Details----");
		System.out.println("Name : "+name );
		System.out.println("age :"+age);
		System.out.println("address :"+address);
	}

}
