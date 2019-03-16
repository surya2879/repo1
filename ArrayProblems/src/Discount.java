import java.util.Scanner;
public class Discount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of items");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the price of items");
	for(int i=0;i<arr.length;i++)
	{
      arr[i]=sc.nextInt();		
	}
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+(arr[i]*95)/100;
	}
	System.out.println("total amount is : " +sum);
}
}
