import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter how many values");
			int n=sc.nextInt();
			int arr[]=new int[n];      //array must be sorted
			System.out.println("enter " +n+ " integer values");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}    
		  Arrays.sort(arr);   //if array is not sorted then sort it
		  System.out.println("after sort");
		  for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i] + " ");
			} 
		  
		  int li=0;              //first index
		  int hi=arr.length-1;  //last index
		  int mi=(li+hi)/2;     //mid index
		  
		  System.out.println("enter element to search");
		  int ele=sc.nextInt();
		  while(li<=hi)
	 {
		  if(arr[mi]==ele)
		  {
			 System.out.println("element is found at " +mi+ " index");
			 break;
		  }
		  
		  else if(arr[mi]<ele)
		  {
			  li=mi+1;
		  }
		  else
		  {
			  hi=mi-1;
		  }
		  
		  mi=(li+hi)/2;
	}
		  if(li>hi)
			  System.out.println("element not found");
	 }

}
