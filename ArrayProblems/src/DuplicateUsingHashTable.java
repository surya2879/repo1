import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateUsingHashTable {
public static void main(String[] args) {
	int[] arr= {3,5,4,3,2,2,1,3,4,4,4,4,4};
	Map<Integer,Integer> map=new HashMap<>();
	for(int n:arr)
	{
		Integer count = map.get(n);
		if(count==null)
		{
			map.put(n,1);
		}
		else
		{
			count=count+1;
			map.put(n,count);
		}
	}
	System.out.println("duplicate elements are");
	Set<Map.Entry<Integer,Integer>> s=map.entrySet(); //Entry is sub interface of Map
	for(Map.Entry<Integer,Integer> me:s)
	{
		if(me.getValue()>1)
		{
			System.out.println(me.getKey() + " ");
		}
	}
}
}
