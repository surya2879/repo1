import java.util.Scanner;
public class Biggest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of elements of array");
	int n=sc.nextInt();
	int [] arr=new int[n];
	System.out.println("enter all the values");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	int big=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>big)
		  big=arr[i];
	}
	System.out.println("biggest element is "+big);
}
}
