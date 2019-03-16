import java.util.Scanner;
public class Reverse {
	static int reversedNumber(int n)
	{
		int rev=0;
		do
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}while(n!=0);
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
