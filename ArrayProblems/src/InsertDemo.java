import java.util.Scanner;

public class InsertDemo {
	  public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("first array");
		 	System.out.println(" enter how many values");
		   	int n=sc.nextInt();
		   	int arr1[]=new int[n];
		 	System.out.println("enter " + n + " values");
		   	for(int i=0;i<arr1.length;i++)
		   	{
		   		arr1[i]=sc.nextInt();
		   	}
		   	System.out.println("second array");
		   	System.out.println(" enter how many values");
		   	int m=sc.nextInt();
		   	int arr2[]=new int[m];
		   	System.out.println("enter " + m + " values");
		   	for(int i=0;i<arr2.length;i++)
		   	{
		   		arr2[i]=sc.nextInt();
		   	}
		   	System.out.println("enter index");
		   	int in=sc.nextInt();
		   	if(in<0 && in>=arr1.length)
		   		System.out.println("invalid index");
		   	else
		   	{
		   		int[] na=new int[arr1.length+arr2.length];
		   		for(int i=0;i<arr1.length;i++)
		   		{
		   			if(i<in)
		   				na[i]=arr1[i];
		   			else
		   				na[i+arr2.length]=arr1[i];
		   		}
		   		for(int i=0;i<arr2.length;i++)
		   		{
		   			na[i+in]=arr2[i];
		   		}
		   		for(int i=0;i<na.length;i++)
			   	{
			   		System.out.print(na[i] + " ");
			   	}
		   		
		   	}
		   	
		   	
}
}
