package practice;

import java.util.Scanner;

public class NoOFwords {
public static void main(String[] args) {
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=sc.nextLine();
	String[] a=str.split(" ");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=" ")
			count++;
	}
	System.out.println(count);
}
}
