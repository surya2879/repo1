
public class Demo {
//car
	String model,color;
	int price;
 Demo()
	{
		this.model="volvo xc40";
		this.color="white";
		this.price=46000;
	}
 public static void main(String[] args) {
	Demo c=new Demo();
	System.out.println(c.model + " " +c.color + " " +c.price);
}
	
}
