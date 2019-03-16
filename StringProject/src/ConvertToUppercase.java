import java.util.Scanner;
public class ConvertToUppercase {
static String toCapital(String str)
{
	String res=" ";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z')
		{
			ch=(char)(ch-32);
		}
		res=res+ch;
	}
	return res;
}
public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=kb.nextLine();
	str=toCapital(str);
	System.out.println("after conversion");
	System.out.println(str);
}
}
