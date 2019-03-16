import java.util.Scanner;
public class Fizzbuzz {
	String fizBuz(int n)
	{
		if(n%5==0&&n%7==0)
			return "fizz and buzz";
		if(n%5==0)
			return "fizz";
		else if(n%7==0)
			return "buzz";
		else
	        return "null";
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		Fizzbuzz fb=new Fizzbuzz();
		String result=fb.fizBuz(n);
		System.out.println(result);
	}

}
