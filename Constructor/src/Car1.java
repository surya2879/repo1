
public class Car1 {
	String model,color;
	int price;
	public Car1(String model, String color, int price) {
		super();
		this.model = model;
		this.color = color;
		this.price = price;
	}
	public static void main(String[] args) {
	Car1 c=new Car1("alto","red",350000);
	System.out.println(c.model + " " +c.color + " " +c.price);
	Car1 c2=new Car1("bmw","bue",420000);
	System.out.println(c2.model + " " +c2.color + " " +c2.price);
	Car1 c3=new Car1("evoque","white",750000);
	System.out.println(c3.model + " " +c3.color + " " +c3.price);
	}
	}
