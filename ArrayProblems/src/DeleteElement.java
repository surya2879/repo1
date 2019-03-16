import java.util.Scanner;
public class DeleteElement {
int [] deleteArr(int a[],int in)
{
	if(in<0 || in>=a.length)
	{
		System.out.println("invalid index");
		return a;
	}
	int []na=new int[a.length-1];
	for(int i=0;i<a.length-1;i++)
	{
		if(i<in)
		   na[i]=a[i];
		else
		   na[i]=a[i+1];
	}
	return na;
}
void dispArr(int[]arr)
{
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i] + " ");
	}
	System.out.println();
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
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	DeleteElement de=new DeleteElement();
	System.out.println("read array");
	int a[]=de.readArr();
	System.out.println("enter index to delete");
	int in=sc.nextInt();
	System.out.println("before delete :");
	de.dispArr(a);
	a=de.deleteArr(a, in);
	System.out.println("after delete :");
	de.dispArr(a);
	}
}

