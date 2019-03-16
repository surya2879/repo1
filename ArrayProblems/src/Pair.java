import java.util.Scanner;
public class Pair {
public void diplayPair(int []arr,int n)
{
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[i]+arr[j]==n)
			   {
				   System.out.println(arr[i]+" "+arr[j]);
			   }
		   }
	   }
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Pair p=new Pair();
	System.out.println("enter no of elements of array");
	int n=sc.nextInt();
	int [] arr=new int[n];
	System.out.println("enter " +n+ " values");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	System.out.println("enter value of n: ");
	int n1=sc.nextInt();
	p.diplayPair(arr, n1);
}
}
