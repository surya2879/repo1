import java.util.Scanner;

public class Palindromenumber {
public static void main(String[] args) {
	int rev=0;
	 Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int t=n;
		while(n!=0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		if(rev==t)
			System.out.println("palindrome");
		else
			System.out.println("not");
}
}
