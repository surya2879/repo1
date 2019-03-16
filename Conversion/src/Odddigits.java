public class Odddigits {
	static int oddinOctal(int n)
	{
		int count=0;
		do
		{
			int r=n%8;
			n=n/8;
	
			if(r==1||r==3||r==5||r==7)
				count++;

	
		}   while(n!=0);
	    return count;
	    }
	public static void main(String[] args)
	{
		System.out.println(oddinOctal(18));
	    System.out.println(oddinOctal(13));
		System.out.println(oddinOctal(70));
	}
}
