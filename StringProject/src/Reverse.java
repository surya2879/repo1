import java.util.Scanner;
public class Reverse {
void reverseString(String str)
{
   for(int i=str.length()-1;i>=0;i--)
	  System.out.print(str.charAt(i));
}
public static void main(String[] args) {
	Reverse rev=new Reverse();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=sc.nextLine();
	rev.reverseString(str);
}
}
