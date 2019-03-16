import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo4 {
public static void main(String[] args) {
	List <String> lst=new ArrayList<String>(); 
	lst.add("orange");
	lst.add("papaya");
	lst.add("mango");
	
	System.out.println(lst);
	lst.add(1,"apple");
	
	System.out.println(lst);
}
}
