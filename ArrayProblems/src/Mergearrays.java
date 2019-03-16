import java.util.Scanner;
public class Mergearrays {
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
int[] merge(int[] x,int[] y)
{
	int z[]=new int[x.length+y.length];
	for(int i=0;i<x.length;i++)
	{
		z[i]=x[i];
	}
	for(int i=0;i<y.length;i++)
	{
		z[x.length+i]=y[i];
	}
	return z;
}
public static void main(String[] args) {
	 Mergearrays ma=new  Mergearrays();
	 System.out.println("read first array");
	 int a[]=ma.readArr();
	 System.out.println("read second array");
	 int b[]=ma.readArr();
	 System.out.println("first array elements");
	 ma.dispArr(a);
	 System.out.println("second array elements");
	 ma.dispArr(b);
	 int c[]=ma.merge(a,b);
	 System.out.println("---after merge---");
	 ma.dispArr(c);
  }
}
