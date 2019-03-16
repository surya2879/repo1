
public class Light implements ISwitch {
 public void switchOn()
 {
	 System.out.println("light switched on");
 }
 public void switchOff()
 {
	 System.out.println("light switched off");
 }
 
 public static void main(String[] args) {
ISwitch sw=new Light();//upcasting
sw.switchOn();
sw.switchOff();
}
 
}
