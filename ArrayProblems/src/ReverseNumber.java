import java.util.Scanner;

public class ReverseNumber {
	public static boolean isPrime(int num)
	{
		for(int i=2;i<=num-1;i++)               //prime
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
}
 public static void main(String[] args) { 
 int [] arr= {4,5,6,7,11,15,16};
 int count=0;
 for(int i=0;i<arr.length;i++)
 {
	if(isPrime(arr[i]))
	{
		count++;
	}
 }
 System.out.println("no. of prime elements in array are:"+count);
}
}
