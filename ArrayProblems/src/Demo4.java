import java.util.Scanner;
public class Demo4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many values you have : ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter " +n+ " integer values" );
	for(int i=0;i<arr.length;i++)
	{
		 arr[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("sum is : " +sum);
	
}
}
