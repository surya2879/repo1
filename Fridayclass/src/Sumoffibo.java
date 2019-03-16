
public class Sumoffibo {
static int sumofFibonacci(int n)
{
int sum=0;
int f1=0,f2=1,f3;
while(n>0)
{
	sum=sum+f1;
	f3=f1+f2;
	f1=f2;
	f2=f3;
	n--;
}
	return sum;
}
public static void main(String[] args)
{
	System.out.println(sumofFibonacci(10));
	//System.out.println(fibo(2));
}
	/*static int fibo(int n)
	{
		int f1=0,f2=1,f3;
		while(n>1)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		n--;
		return f1;
	}*/
}


