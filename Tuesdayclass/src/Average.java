import java.util.Scanner;
public class Average {
	double avgOfNumbers(int sum,int n)
	{
       double avg=sum/n;
		return avg;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		 sum=sum+i;
		System.out.println("sum     of first  "+n+ "  numbers is   :"+sum);
		Average av=new Average();
		double avg=av.avgOfNumbers(sum, n);
		System.out.println("average of first  " +n+ " numbers is :"+avg);
	}
    }


