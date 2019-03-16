import java.util.Scanner;
public class Power {
int powerOfNumber(int n,int p)
{
	int pw=1;
	while(p>0)
	{
		pw=pw*n;
		p--;
	}
	return pw;
}
public static void main(String[] args)
{
	//Scanner sc=new Scanner(System.in);
	Power pwr=new Power();
	int pw=pwr.powerOfNumber(5, 3);
	//System.out.println("enter value of n:");
	//int n=sc.nextInt();
	//System.out.println("enter value of p:");
  //  int p=sc.nextInt();
	//int pw=pwr.powerOfNumber(n,p);
	//System.out.println(n+" to the power of " +p+ " is: " +pw);
	System.out.println(pw);
}
}
