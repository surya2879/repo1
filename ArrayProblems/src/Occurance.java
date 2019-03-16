import java.util.Scanner;
public class Occurance {
  void noOfOccurance(int[] arr)
{
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
		int count=1;
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				arr[j]=arr[n-1];
				n--;
				j--;
			}
		}
		System.out.println(arr[i]+ " ---->" +count);
	}
}
  public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     Occurance oc=new Occurance();
		 System.out.println("enter no of elements of array");
		 int n=sc.nextInt();
		 int [] arr=new int[n];
		 System.out.println("enter " +n+ " values");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
		    for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i] + " ");
			}
			oc.noOfOccurance(arr);
			}
}
