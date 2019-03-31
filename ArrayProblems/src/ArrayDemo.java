import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int[] arr= {45,67,89,23,43};
	  
	    System.out.println("enter index to delete");
	    int in=sc.nextInt();
	    
	    if(in<0 || in>=arr.length)
	    {
	         System.out.println("invalid index");
	         System.out.println("after deletion");
	         for(int i=0;i<arr.length;i++)
	       {
	    	  System.out.print(+ arr[i] + " " );
	       }
	    }
	  		
	    else
	    {
	    int[] na=new int[arr.length-1];
	    System.out.println("after deletion");
	    for(int i=0;i<na.length;i++)
	    {
	    	
	    	if(i<in)
	    	na[i]=arr[i];
	    	else
	    		na[i]=arr[i+1];
	    }
	    for(int i=0;i<na.length;i++)
	    {
	    	System.out.print(+ na[i] + " ");
	    }
	   }
	}
}
