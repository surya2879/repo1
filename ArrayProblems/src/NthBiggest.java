import java.util.Scanner;
public class NthBiggest {
int nthBiggest(int arr[],int n)
{
   for(int i=0;i<arr.length;i++)
	{
		int count=0;;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>arr[i])
				count++;
		}
			if(count==n-1)
				return arr[i];
	}
	return 0;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	NthBiggest nb=new  NthBiggest();
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
		System.out.println("which biggest element you want:");
		int n1=sc.nextInt();
		int big=nb.nthBiggest(arr, n1);
		System.out.println(big);
}
}
