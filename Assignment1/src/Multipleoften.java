import java.util.Scanner;
public class Multipleoften {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		if(n%10==0)
			System.out.println("number is  multiple of 10");
		else
			System.out.println("number is not multiple of 10");
	}

}
