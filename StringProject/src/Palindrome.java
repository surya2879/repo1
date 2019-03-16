import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=kb.nextLine();
	int i=0,j=str.length()-1;
	str=str.toLowerCase();
	while(i<j)
	{
		if(str.charAt(i)!=str.charAt(j))
		{
			System.out.println(str+ " is not palindrome");
			return;
			
		}
		i++;
		j--;
	}
	System.out.println(str+ " is  palindrome");
}
}
