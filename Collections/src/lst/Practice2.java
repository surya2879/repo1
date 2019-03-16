package lst;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class Practice2 {
public static void main(String[] args) {
	List<String> lst=new ArrayList<String>();
	lst.add("btm");
	lst.add("tavrekere");
	lst.add("ecity");
	lst.add("koramangala");
	System.out.println(lst);
	Object arr[]=lst.toArray();
	for(Object obj:lst)
		System.out.println(obj);
	ListIterator<String> itr=lst.listIterator(); 
	while(itr.hasNext())
	{
		String ele=itr.next();
		System.out.println(ele);
	}
	System.out.println(lst);
		
		
}
}
