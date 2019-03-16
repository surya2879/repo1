import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
public class Demo5 {
public static void main(String[] args) {
	List<String> lst=new ArrayList<String>();
	lst.add("orange");
	lst.add("mango");
	lst.add("papaya");
	
	Set<String> set=new HashSet<String>();
	set.add("red");
	set.add("green");
	set.add("yellow");
	System.out.println(lst);
	lst.addAll(1,set);
	System.out.println(lst);
}
}
