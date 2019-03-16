import java.util.Scanner;
public class UniqueArray {
int[] uniqueArr(int arr[])
{
	int n=arr.length;
	for(int i=0;i<n;i++)
	 {
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]==arr[j])
			{
				int k=j;
				while(k<n-1)
			 {
				arr[k]=arr[k+1];
				k++;
			 }
			n--;
		    j--;
	       }
	 }
   }
	int na[]=new int[n];
	for(int i=0;i<n;i++)
	{
		na[i]=arr[i];
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
	UniqueArray ua =new UniqueArray();
	int a[]=ua.readArr();
	System.out.println("before removing the duplicate");
    ua.dispArr(a);
    
	a=ua.uniqueArr(a);
	System.out.println("after removing the duplicate");
	ua.dispArr(a);
}
}
