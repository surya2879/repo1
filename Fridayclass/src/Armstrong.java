import java.util.Scanner;
public class Armstrong 
{
 static int countDigits(int n)
{
	int count =0;
	do
	{
		count++;
		n=n/10;
	}	while(n!=0);
	return count;
}
static int pow(int n,int p)
{
	int pw=1;
    while(p>0)
{
	pw=pw*n;
	p--;
}
  return pw;
}
static boolean isArmstrong(int x)
{
	int sum=0,t=x;
	int dc=countDigits(x);
	do {
		int r=x%10;
		sum=sum+pow(r,dc);
		x=x/10;
	}
	while(x!=0);
	return sum==t;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	boolean res=isArmstrong(n);
	if(res)
		System.out.println(n+" is armstrong number");
	else
	System.out.println(n+" is not armstrong number");
	}
}
