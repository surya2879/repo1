import java.util.Scanner;
public class Product {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int prod=1;
		for(int i=1;i<=n;i++)
		   prod=prod*i;
		System.out.println("prod of first "+n+" numbers is: "+prod);
	}

}
