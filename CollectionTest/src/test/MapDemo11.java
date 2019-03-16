package test;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class MapDemo11 {
public static void main(String[] args) {
	Map<String,Integer> map=new LinkedHashMap<String,Integer>();
	map.put("s", 10);
	map.put("p", 20);
	map.put("q", 30);
	map.put("r", 40);
	System.out.println(map);
	Collection<String> col=map.keySet();
	System.out.println("keys are:" + col);
	Collection<Integer> col1=map.values();
	System.out.println("values are : " +col1);
	System.out.println("keys iteration");
	for(String s :col)
		System.out.println(s);
	System.out.println("  values iteration ");
	for(Integer i:col1)
		System.out.println(i);
	
}
}
