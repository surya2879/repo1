
public class PrimenumberswithinN {
int noPrime(int n)
{
	int i=1,count=0;
	while(true)
	{
		if(noPrime(i))
		{
			count++;
			if(count==n)
				i++;
		}
	}
	return i;
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
}