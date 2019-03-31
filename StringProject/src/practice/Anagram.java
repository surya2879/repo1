package practice;

import java.util.Scanner;

public class Anagram {
	public static int[] countAlpha(String str)
	{
		int count[]=new int [26];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			else if(ch>='a' && ch<='z')
				count[ch-97]++;
		}
		return count;
	}
	
	public static boolean isAnagram(String str1,String str2)
	{
		int[] c1=countAlpha(str1);
		int[] c2=countAlpha(str2);
		for(int i=0;i<26;i++)
		{
			if(c1[i]!=c2[i])
				return false;
		}
	return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=sc.nextLine();
		System.out.println("enter second string");
		String str2=sc.nextLine();
		boolean res = isAnagram(str1, str2);
		if(res)
			System.out.println("Strings are Anagram");
		else
			System.out.println("Strings are not Anagram");
			
	}
 }

