import java.util.Scanner;
public class Perfectnumber {
static boolean isPerfectNumber(int n)
 {
	int i=1,sum=0;
	while(i<=n/2)
	{
		if(n%i==0)
			sum=sum+i;
		i++;
	}
	if(sum==n)
	 return true;
	else 
		return false;
	}

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	boolean rs=isPerfectNumber(n);
	if(rs)//true statement
		System.out.println(n+" is  perfect number");
	else
	    System.out.println(n+" is not perfect number");
}
}