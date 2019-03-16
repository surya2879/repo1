package lst;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
public static void main(String[] args) {
	Map<Integer, String> map=new HashMap<Integer, String>();
	map.put(1,"surya");
	map.put(3,"vimla");
	map.put(7,"vimla");
	map.put(2,null);
	map.put(4,"pandit");
	
	System.out.println(map);
	map.remove(1);
	System.out.println(map);
	map.remove(4);
	Map<Integer, String> map1=new HashMap<Integer, String>();
	map.put(10,"suryaaaa");
	map.put(33,"vimlaaaa");
	map.put(72,"vimaala");
	map.put(22,null);
	map.put(42,"paaandit");
	System.out.println(map1);
	map1.putAll(map);
	System.out.println(map1);
	System.out.println(map);
	//System.out.println(map.get(3));
	String val=map.get(3);
	System.out.println(val);
	System.out.println(map.keySet());
	System.out.println(map.entrySet());
	System.out.println(map.values());
	
}
}
