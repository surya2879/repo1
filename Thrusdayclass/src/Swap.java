import java.util.Scanner;
public class Swap {
public static void main(String args[])
{

	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number:");
	int a=sc.nextInt();
	System.out.println("enter second number:");
	int b=sc.nextInt();
	//int a=1;
	//int b=7;
	System.out.println("after swapping");
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("first number is:" +a);
	System.out.println("second number is:" +b);
	
}
	
}
