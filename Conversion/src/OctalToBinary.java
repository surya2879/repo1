import java.util.Scanner;
public class OctalToBinary {
static int octToDec(int oct)
{
	int dec=0,count=0;
	do
	{
		int r=oct%10;
		dec=dec+r*pow(8,count);
		count++;
		oct=oct/10;
	}   while(oct!=0);
		return dec;
}
static String decToBin(int n)
{
	String bin="";
	do
	{
		int r=n%2;
	    bin=r+bin;
		n=n/2;
	}   while(n!=0);
    return bin;
 }
static String octToBin(int oct)
{
	int dec=octToDec(oct);
	String bin=decToBin(dec);
	return bin;
}

static int pow(int n,int p)
{
	int pw=1;
	while(p>0)
		{
		pw=pw*n;
		p--;
		}
	return  pw;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter octal number");
	int n=sc.nextInt();
	String res=octToBin(n);
	System.out.println(res);
	
}
}
