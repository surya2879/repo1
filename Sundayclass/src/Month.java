import java.util.Scanner;
public class Month {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month number");
		int n=sc.nextInt();
		/*if(n==1)
			System.out.println("jan");
		else if(n==2)
			System.out.println("feb");
		else if(n==3)
		System.out.println("mar");
		else if(n==4)
		System.out.println("apr");
		else if(n==5)
		System.out.println("may");
		else if(n==6)
		System.out.println("jun");
		else if(n==7)
		System.out.println("jul");
		else if(n==8)
		System.out.println("aug");
		else if(n==9)
		System.out.println("sep");
		else if(n==10)
		System.out.println("oct");
		else if(n==11)
		System.out.println("nov");
		else
			System.out.println("dec");*/
		switch(n)
		{	
		case 1:
		    System.out.println("jan");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("mar");
			break;
		case 4:
			System.out.println("apr");
			break;
		case 5 :
			System.out.println("may");
			break;
		case 6:
			System.out.println("jun");
			break;
		case 7:
			System.out.println("jul");
			break;
		case 8:
			System.out.println("aug");
			break;
		case 9:
			System.out.println("sep");
			break;
		case 10:
			System.out.println("oct");
			break;
		case 11:
			System.out.println("nov");
			break;
		case 12:
			System.out.println("dec");
			break;
	default:
			System.out.println("invalid number");
			break;
	}
			
	
}

}
