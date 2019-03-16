import java.util.Scanner;
public class Prime {
	static boolean isPrime(int n)
	{
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
				return false;
			i++;
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		boolean rs=isPrime(n);
		if(rs)
			System.out.println(n+ " a prime number");
		else
			System.out.println(n+ " is not a prime number");

		
	}
	

}
