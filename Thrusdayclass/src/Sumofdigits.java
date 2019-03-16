import java.util.Scanner;
public class Sumofdigits {
static int sumDigits(int n)
	
{
	int sum=0;
	do
	{
		sum=sum+n%10;
		n=n/10;
	}
	while(n!=0);
	return sum;

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Sumofdigits s=new Sumofdigits();
	    System.out.println("enter number");
		int n=sc.nextInt();
		System.out.println("sum of digits of " +n+ " is: " +sumDigits(n));

	}
	
}
