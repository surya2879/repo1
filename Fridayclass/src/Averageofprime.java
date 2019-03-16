import java.util.Scanner;
public class Averageofprime {
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
	static int noPrime(int n)
	{
		int i=1,count=0;
		while(true)
		{
			if(noPrime(i))
			{
				count++;
				if(count==n)
					i++;
			}
		}
		return i;
	}
	public static void main(String args[])
	{
		int sum=0;
		  for(int i=1;i<=1000;i++)
		  {
			  boolean res=noPrime(i);
			  if(res)
			  {
				  sum=sum+i;
				  System.out.println(sum);
			  }
		  }
	System.out.println(+sum);
		
	}
}
