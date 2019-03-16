package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Mapdemo {
public static void main(String[] args) {
	Map<String, Integer> map=new HashMap<String,Integer>();
	map.put("surya",23);
	map.put("mia",21);
	map.put("ritu",22);
	map.put("var",25);
	map.put("ronam",20);
	System.out.println(map);
	
	Collection<String> k = map.keySet();
	      System.out.println("keys are:---->"+k);
	
	Collection<Integer> v = map.values();
	      System.out.println("values are:---->"+v);
	
	System.out.println("keys iteration");
	
	for(String s:k)
	     System.out.println(s);
	
	System.out.println("values iteration");
	
	for(Integer i:v)
        System.out.println(i);
}
}
