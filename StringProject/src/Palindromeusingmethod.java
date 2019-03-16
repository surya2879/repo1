import java.util.Scanner;
public class Palindromeusingmethod {
static boolean isPalindrome(String str)
{
	int i=0,j=str.length()-1;
	str=str.toLowerCase();
	while(i<j)
	{
		if(str.charAt(i)!=str.charAt(j))
	       return false;
	    i++;
		j--;
	}
	return true;
}
public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=kb.nextLine();
	boolean res=isPalindrome(str);
	if(res)
		System.out.println(str+ " is  palindrome");
	else
		System.out.println(str+ " is not palindrome");
}
}
