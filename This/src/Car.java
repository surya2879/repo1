
public class Car {
String mdl;
void drive()
{
	System.out.println(this);
	System.out.println("driving " +this.mdl);
}
public static void main(String[] args) {
	Car c=new Car();
	c.mdl="Swift";
	c.drive();
	
	Car c2=new Car();
	c2.mdl="i20";
	c2.drive();
	//System.out.println(this);//error
}
}
