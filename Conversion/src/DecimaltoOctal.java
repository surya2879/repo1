public class DecimaltoOctal {
	static String dectoOct(int n)
	{
		String oct="";
		do
		{
			int r=n%8;
			n=n/8;
			oct=r+oct;
		}   while(n!=0);
	    return oct;
	    }
	public static void main(String[] args)
	{
		System.out.println(dectoOct(78));
	    System.out.println(dectoOct(13));
		System.out.println(dectoOct(70));
	}
}
