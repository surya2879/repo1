
public class Circle {
	void areaOfCircle(double r)
	{
		double area=3.14*r*r;
		System.out.println("area of circle is:"+area);
	}
	public static void main(String args[])
	{
		Circle c=new Circle();
		c.areaOfCircle(5);
	}

}
