import java.util.Scanner;
public class Posinega {
	boolean isPositive(int x)
	{
	if(x>=0)
	  return true;
	else 
	  return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		Posinega pn=new Posinega();
		boolean rs=pn.isPositive(n);
		if (rs==true)
			System.out.println(n+ " is positive");
			else
			System.out.println(n+ " is negative");
		}
	}



