package practice;

public class SubstringReverse {
	public static void main(String[] args) {
		String str="i love my country";      //using substring() method
		String str1 = str.substring(10,17);
		System.out.println(str1);
		for(int i=str1.length()-1;i>=0;i--)
		{
			char ch=str1.charAt(i);
			System.out.print(ch);
		}
	}
}
