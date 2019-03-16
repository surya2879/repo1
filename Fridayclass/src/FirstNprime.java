public class FirstNprime {
int nPrime(int n)
{
	int i=1;
	do
	{
		if(isPrime(i))
		{
            System.out.println(i);		
            n--;
		}
		i++;
	}while(n>0);
	return n;
}
static boolean isPrime(int n)
{
	int i=2;
	while(i<=n/2)
	{
		if(n%i==0)
			return false;
		i++;
	}
	return true;
}
public static void main(String[] args) {
	FirstNprime fn=new FirstNprime();
	int number=fn.nPrime(10);
	System.out.println(number);
}
}
