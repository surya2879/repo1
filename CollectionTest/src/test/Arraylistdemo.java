package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Arraylistdemo {
public static void main(String[] args) {
	ArrayList<String> lst=new ArrayList<String>();
	lst.add("surya");
	lst.add("varun");
	lst.add("gopu");
	lst.add("rajesh");
	lst.add("ankur");
	lst.add("surya");
	System.out.println(lst);
	lst.clone();
	System.out.println(lst);
	lst.clone();
	System.out.println(lst);
	lst.clone();
	System.out.println(lst);
	lst.clone();
	System.out.println(lst);
	Integer i=lst.size();
	System.out.println(i);
	System.out.println(lst.size());
	String ele=lst.get(2);
	System.out.println(ele);
	System.out.println(lst.get(2));
	Boolean r=lst.isEmpty();
	System.out.println(r);
	boolean r1=lst.contains("mia");
	System.out.println(r1);
	boolean r2=lst.contains("surya");
	System.out.println(r2);
    Object [] arr=lst.toArray();
    for(String s:lst)
    {
    	System.out.println(s);
    }
    System.out.println("---------------------------------------");
    for(int j=0;j<lst.size();j++)
    {
    	String s=lst.get(j);
    	System.out.println(s);
    }
    System.out.println("---------------------------------------");
    Iterator<String> itr=lst.iterator();
    while(itr.hasNext())
    {
    	String ele1=itr.next();
    	if(ele.equalsIgnoreCase("varun"))
    		itr.remove();
    	System.out.println(ele1);
    }
    System.out.println("---------------------------------------");
    ListIterator<String> itr1=lst.listIterator();
    while(itr.hasNext())
    {
    	String ele1=itr.next();
    	System.out.println(ele1);
    }
  Integer i2=  lst.lastIndexOf("surya");
  System.out.println(i2);
  
  lst.set(2, "mia");
  System.out.println(lst);
  
  
  ArrayList<String> lstt=new ArrayList<String>();
  lstt.add("567");
  lstt.add("456");
  lstt.add("345");
  lstt.add("234");
  System.out.println(lstt);
  
  lstt.addAll(lst);
  System.out.println(lstt);
  
  Boolean res=lstt.containsAll(lst);
  System.out.println(res);
  
  Vector<String> v=new Vector<String>();
  v.add("surya");
  v.add("harshit");
  System.out.println(v);
 

	 
}
}
