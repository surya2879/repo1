import java.util.Scanner;
public class Monthnumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month name");
		String month=sc.next();
		switch(month)
		{
		case "jan":
			System.out.println("1");
			break;
		case "feb":
			System.out.println("2");
			break;
		case "mar":
			System.out.println("3");
			break;
		case "apr":
			System.out.println("4");
			break;
		case "may":
			System.out.println("5");
			break;
		case "jun":
			System.out.println("6");
			break;
		case "jul":
			System.out.println("7");
			break;
		case "aug":
			System.out.println("8");
			break;
		case "sep":
			System.out.println("9");
			break;
		case "oct":
			System.out.println("10");
			break;
		case "nov":
			System.out.println("11");
			break;
		case "dec":
			System.out.println("12");
			break;
		default:
				System.out.println("invalid month name");
				break;
			
		}
	}

}
