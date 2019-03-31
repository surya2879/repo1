import java.util.Scanner;
public class Reverse {
	static int reversedNumber(int n)
	{
		int rev=0;
		while(n!=0)
		{
			
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		return rev;
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number :");
	int n=sc.nextInt();
	System.out.println("reverse of" +n+ " is :"+reversedNumber(n));
}
}
