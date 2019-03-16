public class Perfectrange{
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
	int count=0;
    for(int i=1;i<=1000;i++)
    {
    	boolean res=isPerfectNumber(i);
    	if(res)
    	{
    		System.out.println(i);
    	    count++;
        }
    }
	System.out.println("no. of perfect numbers in the range of 1 and 1000 are:"+count);
}
}