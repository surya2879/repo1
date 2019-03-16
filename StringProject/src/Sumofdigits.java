import java.util.Scanner;
public class Sumofdigits {
public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=kb.nextLine();
	int sum=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='0' && ch<='9')
			sum=sum+ch-48;
    }
	System.out.println("sum of digits in " +str+ "is :" +sum);
}
}
