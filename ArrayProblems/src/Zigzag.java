import java.util.Scanner;
public class Zigzag {
int[] zigzagArr(int a[],int b[])
{
	int c[]=new int[a.length+b.length]; 
	int k=0,i=0;
	while(i<a.length&&i<b.length)
	{
		c[k++]=a[i];
		c[k++]=b[i++];
		
	}
	while(i<a.length)
	{
		c[k++]=a[i++];
	}
	while(i<b.length)
	{
		c[k++]=b[i++];
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
	 Zigzag  zg=new  Zigzag ();
	 System.out.println("read first array");
	 int a[]=zg.readArr();
	 System.out.println("read second array");
	 int b[]=zg.readArr();
	 System.out.println("first array elements");
	 zg.dispArr(a);
	 System.out.println("second array elements");
	 zg.dispArr(b);
	 int c[]=zg.zigzagArr(a,b);
	 System.out.println("---after merge---");
	 zg.dispArr(c);
 }
}


