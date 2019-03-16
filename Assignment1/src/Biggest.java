import java.util.Scanner;
public class Biggest {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
	    if(a>b)
			System.out.println(a+ " is the biggest number");
		else 
			System.out.println(b+ " is the biggest number");
	    }
	}
