import java.util.Scanner;
public class Smallest {
 int smallestElement(int[] arr)
 {
	 int small=arr[0];
	 for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<small)
				small=arr[i];
		}
	 return small;
 }
 public static void main(String[] args) {
	   // int []arr= {98,102,45,67,78,42};
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];;
	    System.out.println("enter the elements of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	    Smallest s=new  Smallest();
		int small= s.smallestElement(arr);
		System.out.println("smallest element is "+small);
	}
}

