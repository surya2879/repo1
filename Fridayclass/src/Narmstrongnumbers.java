import java.util.Scanner;
public class Narmstrongnumbers {
int nthArmstrong(int n)
{
	int i=1;
	while(n>0)
		{
		if(isArmStrong(i))
	     	n--;
		i++;
		}
	return i-1;
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
static int countDigits(int n)
{
	int count =0;
	while(n!=0)
	{
		count++;
		n=n/10;
	}
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
public static void main(String args[])
{
	Narmstrongnumbers narm=new Narmstrongnumbers();
	int numberofarmstrong=narm.nthArmstrong(15);
	System.out.println(numberofarmstrong);
}
}