
public class Dog {
double ht=5.8;//instance variable
void bark()
{
	System.out.println("dog barks");
}
void jump()
{
	double ht=5.6;//local variable    //local scope
    System.out.println("height of dog is:" +this.ht);
	System.out.println(" dog jumps from height " +ht);
}

public static void main(String[] args) {
	Dog d=new Dog();
	d.bark();
	d.jump();
}
}
