import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many values");
	int n=sc.nextInt();
	int [] arr=new int[n];
	System.out.println("enter the values");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
    int biggest=arr[0];
for(int i=0;i<arr.length;i++)
if(arr[i]>biggest)
{
	biggest=arr[i];
}
	System.out.println(biggest);
}
}
