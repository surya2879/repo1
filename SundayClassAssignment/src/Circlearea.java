import java.util.Scanner;
public class Circlearea {
	double areaOfCircle(double r)
	{
		
		double area=3.14*r*r;
		return area;
	}
	public static void main(String args[])
	{
		Circlearea a=new Circlearea();
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter radius of circle");
		//double r =sc.nextDouble();
		//double area=a.areaOfCircle(r);
		//System.out.println(area);
		double area=a.areaOfCircle(5);
		System.out.println("area of circle is : "+area);
	}


}
