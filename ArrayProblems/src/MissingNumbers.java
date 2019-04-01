import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {
   static void findMissingNumber(int[] arr) {
        int currentValue=arr[0];
        int max=arr[arr.length-1];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=currentValue) 
            {
               for(int j=currentValue;j<max;j++) 
                { 
                   System.out.println("missing element found " + j);
                }
            }
         currentValue = arr[i] + 1;
       }
  }
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	 	System.out.println(" enter how many values");
	   	int n=sc.nextInt();
	   	int arr[]=new int[n];
	 
	 	System.out.println("enter " + n + " values");
	   	for(int i=0;i<arr.length;i++)
	   	{
	   		arr[i]=sc.nextInt();
	   	}
	  Arrays.sort(arr);
      findMissingNumber(arr);
   }
}
