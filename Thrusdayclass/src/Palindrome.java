import java.util.Scanner;
public class Palindrome {
boolean isPalindrome(int n)
{
	int rev=0;
	int t=n;
	do 
	{
	  int r=n%10;
	  rev=rev*10+r;
	  n=n/10;
	}while(n!=0);
	if(rev==t)
		return true;
	else
	return false;
	}

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	Palindrome p=new  Palindrome();
	boolean res=p.isPalindrome(n);
	if(res)
		System.out.println(n+ " is a palindrome number");
	else
		System.out.println(n+ " is not a palindrome number");
	
}
}
