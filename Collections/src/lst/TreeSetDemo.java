package lst;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	Set<String> st=new TreeSet<String>(Collections.reverseOrder());
	st.add("surya");
	st.add("srk");
	st.add("rasmalai");
	st.add("anisha");
	System.out.println(st);
	
	Iterator<String> itr=st.iterator();
	while(itr.hasNext())
	{
		String ele=itr.next();
		System.out.println(ele);
	}
	
}
}
