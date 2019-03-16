public class PrimeElements {
	int countPrime(int arr[])
	{ 
		int count=0;
		for(int i=0;i<arr.length;i++)
		   if(isPrime(arr[i]))
               count++;
		return count;
	}
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
	public static void main(String[] args) {
		PrimeElements pe=new PrimeElements();
		int arr[]= {3,5,31,33,57,68,98,23};
		int count=pe.countPrime(arr);
		System.out.println("no. of prime elements in array is : " +count);
		
	}
}
