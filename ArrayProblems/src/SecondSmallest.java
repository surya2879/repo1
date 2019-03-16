import java.util.Scanner;
public class SecondSmallest {
public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter how many elements ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter value of " +n+ " elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int smallest= arr[0];
		int secondsmallest=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				secondsmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]<secondsmallest && arr[i]>smallest){
				 secondsmallest=arr[i];
		      }
		}
		System.out.println("second smallest element of array is: " +secondsmallest);
	}
	}

