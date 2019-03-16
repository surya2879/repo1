import java.util.Scanner;

public class Hextobin {
static int hextoDec(String hex)
{
	int dec=0,count=0;
    for(int i=hex.length()-1;i>=0;i--,count++)
    {
    	char ch=hex.charAt(i);
    	if(ch>='A' && ch<='F')
    	  dec=dec+(ch-55)*pow(16,count);
    	else if(ch>='a' && ch<='f')
    		  dec=dec+(ch-87)*pow(16,count);
    	else
    		 dec=dec+(ch-48)*pow(16,count);
    }
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
static String dectoBin(int n)
{
	String bin="";
	do {
		int r=n%2;
		bin=r+bin;
		n=n/2;
	}while(n!=0);
    return bin;
}
static String hextoBin(String hex)
{  
	int dec=hextoDec(hex);
	String bin=dectoBin(dec);
	return bin;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter hexadecimal number");
    String s=sc.next();
	String res=hextoBin(s);
	System.out.println(res);
	
}
}
