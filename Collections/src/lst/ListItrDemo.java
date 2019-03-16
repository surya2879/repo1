package lst;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItrDemo {
public static void main(String[] args) {
	ArrayList<Integer> lst=new ArrayList<Integer>();
	lst.add(10);
	lst.add(20);
	lst.add(30);
	lst.add(40);
	System.out.println(lst);
	ListIterator<Integer> itr=lst.listIterator();
	while(itr.hasNext())
	{
		Integer ele=itr.next();
		System.out.println(ele);
	}
	
	System.out.println("list iteration in reverse order");
	Object[] arr=lst.toArray();
	for(int i=lst.size()-1;i>=0;i--)
	{
		Integer i1=lst.get(i);
		System.out.println(i1);
	}
	 
	System.out.println("list iteration in reverse order");//has previous
	ListIterator<Integer> li=lst.listIterator();
	while(itr.hasPrevious())
	{
		Integer i2=itr.previous();
		System.out.println(i2);
		}
	}
}
