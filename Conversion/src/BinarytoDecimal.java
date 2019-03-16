import java.util.Scanner;
public class BinarytoDecimal {
static int bintoDec(int bin)
{
	int dec=0,count=0;
	do 
	{
		int r=bin%10;
		dec=dec+r*pow(2,count);
		count++;
		bin=bin/10;
	}   while(bin!=0);
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
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter binary number");
	int n=sc.nextInt();
	int dec=bintoDec(n);
	System.out.println("decimal of " + n + " is " +dec);
}
}
