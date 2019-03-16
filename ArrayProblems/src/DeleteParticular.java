import java.util.Scanner;
public class DeleteParticular {
int[] deleteEle(int []arr,int ele)
{
    int in=-1;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==ele)
		{
			in=i;
			break;
		}
	}
	if(in==-1)
	{
		System.out.println("element not found");
		return arr;
	}
	return deleteArr(arr,in);
}

int [] deleteArr(int arr[],int in)
{
	int []na=new int[arr.length-1];
	for(int i=0;i<arr.length-1;i++)
	{
		if(i<in)
		   na[i]=arr[i];
		else
		   na[i]=arr[i+1];
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
	DeleteParticular dp=new DeleteParticular();
	System.out.println("read array");
	int arr[]=dp.readArr();
	System.out.println("enter element to delete");
	int ele=sc.nextInt();
	System.out.println("before delete :");
	dp.dispArr(arr);
	arr=dp.deleteEle(arr, ele);
	System.out.println("after delete :");
	dp.dispArr(arr);
}
}
