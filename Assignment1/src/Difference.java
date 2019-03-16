import java.util.Random;
import java.util.Scanner;
public class Difference {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random rd =new Random();
		System.out.println("enter number");
		int a=sc.nextInt();
		System.out.println("guessed number is " +a);
		int b=rd.nextInt(10);
		System.out.println("system generated number is " +b);
		System.out.println("differnce is " +(a-b));
	}

}

