import java.util.Scanner;
public class Evenodd {
	static int countEvenOdd(int n)
	{
		int r=0;
		int even=0;
		int odd=0;
		do
		{
			r=n%10;
			if(r%2==0) 
			  even++;
		    else
			  odd++;
			n=n/10;
		}
		while(n!=0);
		 System.out.println("no. of odd digits : "+odd);
		 System.out.println("no. of even digits :"+even);
		return odd;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Evenodd ed=new Evenodd();
		int count=ed.countEvenOdd(n);
		
	}
}
