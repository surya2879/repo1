import java.util.Scanner;
public class Operation {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two integers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int add=a+b;
		System.out.println("additon is:" +add);
		int sub=a-b;
		System.out.println("subtraction is:" +sub);
		int mul=a*b; 
		System.out.println("multiplication is:" +mul);
		double div=a/b;
		System.out.println("division is:" +div);
	}
	

}
