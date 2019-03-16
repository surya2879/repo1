import java.util.Scanner;
public class Averageofdigits
{
static double avgDigit(int n)
	{
		double sum=0;
		int count =0;
		double avg=0;
		do
		{
			sum=sum+n%10;
			n=n/10;
			count++;
			avg=sum/count;
		}
		while(n!=0);
		return avg;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		Averageofdigits av=new Averageofdigits();
		double avg=av.avgDigit(n);
		System.out.println("average of digits of " +n+ " is :"+avg);
	}
	}