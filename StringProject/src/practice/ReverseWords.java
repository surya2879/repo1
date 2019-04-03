package practice;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		//String s=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");  
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i] + " ");
		}
	/*for(int i=arr.length-1;i>=0;i--)
		{
			s=s+arr[i]+" ";
		}
		System.out.println(s);*/

	}
}

//ouput: surya prakash sharma----->sharma prakash surya