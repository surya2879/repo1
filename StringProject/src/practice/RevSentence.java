package practice;

import java.util.Scanner;

public class RevSentence {
public static void main(String[] args) {
	String str="my name is surya";  //ayrus si eman ym
//	String s=" ";
	//Scanner sc=new Scanner(System.in);
	//System.out.println("enter the string");
	//String str=sc.nextLine();
	for(int i=str.length()-1;i>=0;i--)
	{
		char ch=str.charAt(i);
		System.out.print(ch);
	}
}
}
