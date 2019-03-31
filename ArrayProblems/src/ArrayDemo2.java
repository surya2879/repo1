import java.util.Scanner;

public class ArrayDemo2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] arr= {3,56,54,3,48};
	int sum=0;
	int avg;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	avg=sum/arr.length;
	System.out.println(avg);
	
}
}
