import java.util.Scanner;

public class Searching {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);    //linear search
		  int i;
		  int arr[]= {10,20,30,40,50,60,};
	      System.out.println("enter element to search");
		  int ele=sc.nextInt();
		  for(i=0;i<arr.length;i++) 
		  {
			  if( arr[i]==ele)
			  {
			     System.out.println("element found at index " +i);
			     break;
			  }
		  }
		  if(i==arr.length)
	        {
		      System.out.println("element not found");
			}
	  }
 }

