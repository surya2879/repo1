
public class Car {
 String name="i20";
 int price=5000;
 
 @Override
	public String toString() {
		
	//return " [" +this.name+ " " + this.price+ "]";
	 return "["+this.name+ " " + this.price + "]";
	}
 public static void main(String[] args) {
	Car c=new Car();
	System.out.println(c);
}
}
