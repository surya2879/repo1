public class Primerange {
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
		int count=0;
		for(int i=1;i<=100;i++)
		{
			boolean res=isPrime(i);
			if(res)
			{
				System.out.println(i);
			    count++;
		    }
		}
		System.out.println("no. of prime number is range of 1  and 100 are: "+count);
		
}
}
