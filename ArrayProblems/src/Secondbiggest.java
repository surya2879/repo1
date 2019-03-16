import java.util.Scanner;
public class Secondbiggest {
public static void main(String[] args) {
	//int [] arr= {45,67,89,76};
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many elements ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter value of " +n+ " elements ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	int biggest= arr[0];
	int secondbiggest=arr[1];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>biggest)
		{
			secondbiggest=biggest;
			biggest=arr[i];
		}
		else if(arr[i]>secondbiggest && arr[i]<biggest){
			 secondbiggest=arr[i];
	      }
	}
	System.out.println("second largest element of array is: " +secondbiggest);
}
}
