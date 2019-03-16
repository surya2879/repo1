import java.util.Scanner;
public class ConvertToLowerCase {
	static String toLower(String str)
	{
		String res=" ";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				ch=(char)(ch+32);
			}
			res=res+ch;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=kb.nextLine();
		str=toLower(str);
		System.out.println("after conversion");
		System.out.println(str);
	}
}
