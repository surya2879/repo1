import java.util.Scanner;
public class Weightoflift {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of persons");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter weight of " +n+ " persons ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("total weight is :" +sum);
   if(sum<=890)
	   System.out.println("lift is moving");
   else
	   System.out.println("lift is not moving");
}
}
