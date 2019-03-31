import java.util.Scanner;

public class DeleteElementArr { //delete particular element
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
		
		System.out.println("enter element");
		int ele=sc.nextInt();
		int in=-1;
		
		 for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==ele)
				{
					System.out.println("element found");
				    in=i;
				    break;
				}
			}
		
		if(in==-1)
		      System.out.println("element not found");
		    
		
	
      
       int na[]=new int[arr.length-1];
       for(int i=0;i<arr.length-1;i++)
       {
    	   if(i<in)
    		   na[i]=arr[i];
    	   else
    		   na[i]=arr[i+1];
       }
       for(int i=0;i<na.length;i++)
       {
    	   System.out.print(na[i] + " ");
       }
     
	}
  }



