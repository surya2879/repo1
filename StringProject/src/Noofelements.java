import java.util.Scanner;
public class Noofelements {
public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=kb.nextLine();
	int vc=0,cc=0,uc=0,lc=0,dc=0,sc=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='A' && ch<='Z')
		{
			uc++;
			if(ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U')
				vc++;
			else
				cc++;
		}
		else if(ch>='a'&&ch<='z')
		{
			lc++;
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u' )
				vc++;
			else
				cc++;
		}
		else if(ch>='0' && ch<='9')
			dc++;
		else
			sc++;
	}
	System.out.println("no. of vowels :" +vc);
	System.out.println("no. of consonants :" +cc);
	System.out.println("no. of capital letters :" +uc);
	System.out.println("no. of small letters :" +lc);
	System.out.println("no. of digits :" +dc);
	System.out.println("no. of special characters :" +sc);
}
}
