package practice;
import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
	int rev=0;
	Scanner kb=new Scanner(System.in);
	System.out.println("enter the number");
	int n=kb.nextInt();
	while(n!=0)
	{
		rev=rev*10;
		rev=rev+n%10;
		n=n/10;
	}
	System.out.println(rev);
}
}

