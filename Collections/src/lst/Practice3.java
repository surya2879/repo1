package lst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Practice3 {
public static void main(String[] args) {
	List<String> lst=new ArrayList<String>();
	lst.add("surya");
	lst.add("todo");
	lst.add("raka");
	lst.add("anna");
	lst.add("prince");
	System.out.println(lst);
	//Iterator<String> itr=lst.iterator();
	ListIterator<String> itr=lst.listIterator();
	while(itr.hasNext())
	{
		String ele=itr.next();
	//	if(ele.equalsIgnoreCase("Surya"))
		//	itr.remove();
	   System.out.println(ele);	
	}
	//System.out.println(lst);
	
/*Object arr[]=lst.toArray();
	for(Object obj:arr)
	{
		System.out.println(obj);
	}*/
	
	/*for(String s:lst)
		System.out.println(s);*/
}
}
