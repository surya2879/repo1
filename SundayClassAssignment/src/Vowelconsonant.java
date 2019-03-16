import java.util.Scanner;
public class Vowelconsonant {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any character");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("character is Vowel");
		else
			System.out.println("charcater is consonant");
	}

}
