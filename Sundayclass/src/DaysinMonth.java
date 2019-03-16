import java.util.Scanner;
public class DaysinMonth {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter month number");
	int n=sc.nextInt();
	//if(n%2==1)
	/*	System.out.println("days in month are 31");
	else if(n%2==0&&n!=8&&n!=2)
		System.out.println("days in month are 30");
	else if(n==8)
		System.out.println("days are 31");
	else if(n==2)
		System.out.println("days or 28 or 29");*/
	switch(n)
	{
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("31 days");
		break;
	case 2:
		System.out.println("28 or 29 days");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("30 days");
		break;
		default:
			System.out.println("invalid month number");
	}
	
}
}
