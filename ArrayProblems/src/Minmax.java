import java.util.Scanner;

public class Minmax {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter how many values");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("enter " +n+ " integer values");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
		  int max=arr[0];
		  int min=arr[1];
		  for(int i=0;i<arr.length;i++)
		  {
			  if(arr[i]>max)
				  max=arr[i];
			  if(arr[i]<min)
				  min=arr[i];
				  
		  }
		  System.out.println("maximum value of array is: " +max);
		  System.out.println("minimum value of array is: " +min);
	  }
	  
	 }

