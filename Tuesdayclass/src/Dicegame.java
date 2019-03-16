import java.util.Scanner;
import java.util.Random;
public class Dicegame {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Random rd=new Random();
	System.out.println("enter first player name");
	String fname=sc.next();
	System.out.println("enter second player name");
	String sname=sc.next();	
	int ftotal=0,stotal=0;
	while(true)
	{
	System.out.println("press any key from keyboard to flip the dice");
	sc.next();
	int fr=rd.nextInt(6)+1;
	System.out.println(fname+" score is :"+fr);
	if(ftotal+fr<=100)
		ftotal=ftotal+fr;
	System.out.println(fname+" total score "+ftotal);
	if(ftotal==100)
	{
		System.out.println(fname+" won the game");
		break;
	}
	System.out.println("press any key from keyboard to flip the dice");
	sc.next();
	int sr=rd.nextInt(6)+1;
	System.out.println(sname+" score is :"+sr);
	if(stotal+sr<=100)
		stotal=stotal+sr;
	System.out.println(sname+" total score "+stotal);
	if(ftotal==100)
	{
		System.out.println(sname+" won the game");
		break;
	}
	
	/*if(fr>sr)
		System.out.println(fname+" won the game");
	else if(sr>fr)
		System.out.println(sname+" won the game");
	else
		System.out.println("draw");*/
	}
	
}
}
