import java.util.Scanner;
public class Evenodd {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		//if((n/2)*2==n)
		//	System.out.println("number is even");
		//else 
			//System.out.println("number is odd");
		String st[]= {"even","odd"};
		System.out.println(n+ "is" + st[n%2]);
	}

}
