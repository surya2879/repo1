import java.util.Scanner;
public class MergeSortedArray {
int []mergeSort(int a[],int b[])
{
	int c[]=new int[a.length+b.length];
	int i=0,j=0,k=0;
	while(i<a.length&&j<b.length)
	{
		if(a[i]<b[j])
		{
			c[k++]=a[i++];
		}
		else
		{
			c[k++]=b[j++];
		}
	}
	while(i<a.length)
	{
		c[k++]=a[i++];
	}
	while(j<b.length)
	{
		c[k++]=b[j++];
	}
	return c;
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
	MergeSortedArray msa=new  MergeSortedArray();
	 System.out.println("read first array");
	 int a[]=msa.readArr();
	 System.out.println("read second array");
	 int b[]=msa.readArr();
	 System.out.println("first array elements");
	 msa.dispArr(a);
	 System.out.println("second array elements");
	 msa.dispArr(b);
	 int c[]=msa.mergeSort(a,b);
	 System.out.println("---after merge---");
	 msa.dispArr(c);
 }
}

