import java.util.LinkedList;

public class FetchDemo {
public static void main(String[] args) {
	LinkedList<String> lst=new LinkedList<String>();
	lst.add("surya");
	lst.add("vishal");
	lst.add("ankur");
	lst.add("rahul");
	lst.add("ronam");
	System.out.println(lst);
	for(int i=lst.size()-1;i>=0;i--)
	{
		String s=lst.get(i);
		System.out.println(s);
	}
}
}
