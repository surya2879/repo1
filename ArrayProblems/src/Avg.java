import java.util.Scanner;
public class Avg {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many numbers");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter values of " +n+ " numbers");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{  
	   sum=sum+arr[i];
    }
	int avg=sum/n;
	System.out.println("average of " +n+ " numbers is: " +avg);
}
}
