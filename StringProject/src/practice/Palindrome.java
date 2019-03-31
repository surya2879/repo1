package practice;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(String str)
	{
		  int i=0;
		    int j=str.length()-1;
		    str=str.toLowerCase();
		    while(i<j)
		    {
		    	if(str.charAt(i)!=str.charAt(j))
		    	{
		    		System.out.println("Strings are not palindrome");
		    	}
		    	i++;
		    	j--;
		    }
		    
		    return true;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	boolean res = Palindrome.isPalindrome(str);
	if(res)
		System.out.println("String is palindrome");
	}
}

