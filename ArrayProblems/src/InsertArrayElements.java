import java.util.Scanner;
public class InsertArrayElements
{
   int[] insertArray(int []a,int  in,int[] b)
	{
		if(in<0 || in>a.length)
		{
			System.out.println("invalid index");
		    return a ;
		}
	int na[]=new int [a.length + b.length];
	for(int i=0;i<a.length;i++)
	{
		if(i<in)
		    na[i]=a[i];
		else
			na[i+b.length]=a[i];
	}
	for(int i=0;i<b.length;i++)
	{
		na[i+in]=b[i];
	}
	return na;
}
   int[] readArr()
   {
   	Scanner sc=new Scanner(System.in);
   	System.out.println("enter how many values");
   	int n=sc.nextInt();
   	int arr[]=new int[n];
   	System.out.println("enter " +n+ " integer values");
   	for(int i=0;i<arr.length;i++)
   	{
   		arr[i]=sc.nextInt();
   	}
   	return arr;
   }
   
   void dispArr(int[]arr)
   {
   	for(int i=0;i<arr.length;i++)
   	{
   		System.out.print(arr[i] + " ");
   	}
   	System.out.println();
   }
   
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    InsertArrayElements inae=new InsertArrayElements();
	    System.out.println("read array");
	    int a[]=inae.readArr();
	    System.out.println("enter index to add");
	    int in=sc.nextInt();
	  
	    System.out.println("enter the elements to insert");
	    int b[]=inae.readArr();
	    
	    System.out.println("before adding");
	    inae.dispArr(a);
	   
		a=inae.insertArray(a, in, b);
	    System.out.println("after adding");
	    inae.dispArr(a);
	   }
}
