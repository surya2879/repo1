import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	for(int i=str.length()-1;i>=0;i--)
	{
		System.out.print(str.charAt(i));
	}
  }
}
