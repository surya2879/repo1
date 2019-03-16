import java.util.Random;
import java.util.Scanner;
public class Guessnumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("guess any one number between 0 and 9");
		int x=sc.nextInt();
		Random rd=new Random();
		int y=rd.nextInt(10);
		if(x==y)
		System.out.println("wow your guess is correct");
		else
			System.out.println("ohh sorry your guess is wrong it was " +y);
		System.out.println("thank you");
	}
		

}
