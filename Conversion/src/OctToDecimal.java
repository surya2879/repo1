import java.util.Scanner;
public class OctToDecimal {
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
	int dec=octToDec(n);
	System.out.println(+dec);
}
}
