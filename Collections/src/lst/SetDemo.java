package lst;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	Set<String> st=new HashSet<String>();
	st.add("surya");
	st.add("sha");
	st.add("suryaa");
	st.add("suryssa");
	System.out.println(st);
	
	Iterator<String> itr=st.iterator();
	while(itr.hasNext())
	{
		String ele=itr.next();
		System.out.println(ele);
	}
	
	
	
	
	
}
}
