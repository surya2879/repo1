import java.util.Scanner;
public class Pangram {
public static boolean isPangram(String str)
{
	if(str.length()<26)
	return false;
	int c[]=countAlpha(str);
	for(int i=0;i<c.length;i++)
	{
		if(c[i]==0)
			return false;
	}
	return true;
}
static int[] countAlpha(String str)
{
	int count[]=new int[26];
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='A' && ch<='Z')
			count[ch-65]++;
		else if(ch>='a' && ch<='z')
			count[ch-97]++;
	}
	return count;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=sc.nextLine();
	boolean res=isPangram(str);
	if(res)
		System.out.println("string is pangram");
	else
		System.out.println("string is not pangram");
}
}
