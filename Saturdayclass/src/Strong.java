import java.util.Scanner;
public class Strong {
static boolean isStrong(int n)
{
	int sum=0,t=n;
	int r=n%10;
	sum=sum+fact(r);
	n=n/10;
	while(n!=0);
		if(sum==t)
			return true;
		else 
			return false;
}
static int fact(int n)
{
	int f=1;
	while(n>1)
	{
		f=f*n;
	    n--;
	}
	return f;
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	boolean res=isStrong(n);
	if(res==true)
		System.out.println(n+" is strong number");
	else
		System.out.println(n+" is not strong number");
}
}
