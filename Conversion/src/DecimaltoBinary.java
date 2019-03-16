public class DecimaltoBinary {
static String dectoBin(int n)
{
	String bin="";
	do
	{
		int r=n%2;
		n=n/2;
		bin=r+bin;
	}   while(n!=0);
    return bin;
    }
public static void main(String[] args)
{
	System.out.println(dectoBin(123));
	System.out.println(dectoBin(13));
	System.out.println(dectoBin(70));
}
}
