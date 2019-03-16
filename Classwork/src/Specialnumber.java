import java.util.Scanner;
public class Specialnumber {
	boolean isSpecialTwoDigitNumber(int n)
	{
		int d1=n%10;
		int d2=n/10;
		int sum=d1+d2+d1*d2;
		if(sum==n)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
		Specialnumber sn=new Specialnumber();
		System.out.println("enter number");
		int n=sc.nextInt();
    	boolean result=sn.isSpecialTwoDigitNumber(n);
		if(result==true)
			System.out.println(n+" is a special number");
		else
			System.out.println(n+" is not a special number");
	}

}
