import java.util.Scanner;
public class Simpleinterest {
	void calculateSi(int p,double t,double r)
	{
		System.out.println("principle amount :" +p);
		System.out.println("rate of interest :" +r);
		System.out.println("time             :" +t);
		double si=p*r*t/100;
		System.out.println("simple interest :" +si);
		System.out.println("total amount you have to pay is :" +(p+si));
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of p");
	    int p=sc.nextInt();
		System.out.println("enter value of r");
		double r=sc.nextDouble();
		System.out.println("enter value of t");
		double t=sc.nextDouble();
		Simpleinterest sintr=new Simpleinterest();
        //sintr.calculateSi(5000,12.5,10);
        double si=p*r*t/100;
        System.out.println("simple interest :" +si);
        System.out.println("total amount you have to pay is :" +(p+si));
	}
		//si.calculateSi(5000,10.2,5);
		//System.out.println("_______________________");
		//si.calculateSi(4000,8.5,4);
		
	}


