import java.util.Scanner;
public class Biggest1 {
int biggestElement(int[] arr)
 { 
	int big=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>big)
			big=arr[i];
	}
	return big;
 }
public static void main(String[] args) {
	//int []arr= {98,102,45,67,78,42};
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];;
    System.out.println("enter the elements of array");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	 Biggest1 b=new  Biggest1();
	int big= b.biggestElement(arr);
	System.out.println("biggest element is "+big);
}
}
