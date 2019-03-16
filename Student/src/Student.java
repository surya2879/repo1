import java.util.Scanner;
public class Student {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student name");
		String name=sc.next();
		System.out.println("enter student id");
		int id=sc.nextInt();
		System.out.println("enter student percentage");
		double percentage=sc.nextDouble();
		System.out.println("Student details");
		System.out.println("Name : "+name );
		System.out.println("id :"+id);
		System.out.println("percentage :"+percentage);
		}

}
