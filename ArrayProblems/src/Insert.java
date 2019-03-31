import java.util.Scanner;

public class Insert {
	public static void main(String[] args) {
		int [] arr={34,56,54,43,78};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter index");
		int in=sc.nextInt();
		System.out.println("enter element");
		int ele=sc.nextInt();
		if(in<0 || in>arr.length)
		{
			System.out.println("invalid index");
			System.out.println("elements are:");
			for(int i=0;i<arr.length;i++)
		       {
		    	   System.out.print( arr[i] + " ");
		       }
		}
		else
		{
			int na[]=new int[arr.length+1];
			for(int i=0;i<arr.length;i++)
			{
				if(i<in)
					na[i]=arr[i];
				else
					na[i+1]=arr[i];
			}
			na[in]=ele;
			for(int i=0;i<na.length;i++)
			{
				System.out.print(na[i] + " ");
			}
		}
       
}
}
