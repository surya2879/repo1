import java.util.Scanner;
public class Octtohex {
static int octtoDec(int oct)
{
	int dec=0,count=0;
	do {
		int r=oct%10;
		dec=dec+r*pow(8,count);
		count++;
		oct=oct/10;
	   }while(oct!=0);
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
	return pw;
}
static String dectoHex(int n)
{  
	String hex="";
	do
	{
		int r=n%16;
		if(r<10)
			hex=r+hex;
		else if(r==10)
			hex='A'+hex;
		else if(r==11)
			hex='B'+hex;
		else if(r==12)
			hex='C'+hex;
		else if(r==13)
			hex='D'+hex;
		else if(r==14)
			hex='E'+hex;
		else if(r==15)
			hex='F'+hex;
		n=n/16;
	}while(n!=0);
	return hex;
}

static String octtoHex(int oct)
{
	int dec=octtoDec(oct);
	String hex=dectoHex(dec);
	return hex;
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter octal number");
	int n=sc.nextInt();
	String res=octtoHex(n);
	System.out.println(res);
	
}
}
