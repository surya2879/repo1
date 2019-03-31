package practice;

import java.util.Scanner;

public class Convert {
	public static void main(String[] args) {
		String s=" ";
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=kb.nextLine();
		/*for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)(ch+32);
			}
			s=s+ch;
		}
		System.out.println(s);*/
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char)(ch-32);
			}
			s=s+ch;
		}
		System.out.println(s);
	}
}
