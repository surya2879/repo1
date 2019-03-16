import java.util.Scanner;
public class Rectangle {
 void calculateRectangle(double l,double b)
 {
	 System.out.println("****Rectangle****");
	 System.out.println("length  :" +l);
	 System.out.println("breadth :" +b);
	 double area=l*b;
	 double circumference=2*(l+b);
	 System.out.println("area of rectangle  is         :" +area);
	 System.out.println("circumference of rectangle is :" +circumference);
 }
 public static void main(String args[])
 {
	 Rectangle rc=new Rectangle();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter length  of rectangle");
	 double l=sc.nextDouble();
	 System.out.println("enter breadth of rectangle");
	 double b=sc.nextDouble();
	 rc.calculateRectangle(l, b);
	// rc.calculateRectangle(5.0,7.8);
 }
}
