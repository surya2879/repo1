package lst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practicee {
public static void main(String[] args) {
	List<String> lst=new ArrayList<String>();
	lst.add("A");
	lst.add("B");
	lst.add("C");
	lst.add("D");
	lst.add("E");
	lst.add("F");
	System.out.println(lst);
	Iterator<String> itr=lst.iterator();
	while(itr.hasNext())
	{
		String ele=itr.next();
	//	if(ele.equalsIgnoreCase("C"))
		//	itr.remove();
		System.out.println(ele);
	}
	System.out.println(lst);
}
} 





	
	

	
	
	
	



