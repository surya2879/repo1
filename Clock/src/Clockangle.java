import java.util.Scanner;
public class Clockangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter hour and minute");
	int hr=sc.nextInt();
	int min=sc.nextInt();
	double hangle=hr*30+min*0.5;
	double mangle=min*6;
	double angle;
	if(hangle>mangle)
		angle=hangle-mangle;
	else
		angle=mangle-hangle;
	if(angle>180)
		angle=360-angle;
	System.out.println("least angle is : "+ angle );
}
}
