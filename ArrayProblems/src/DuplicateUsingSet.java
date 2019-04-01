import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateUsingSet {
public static void main(String[] args) {
	int arr[]= {3,5,4,3,3,3,2,2,2,1,1,1,1};
	Arrays.sort(arr);
	System.out.println("duplicate elements are");   // find duplicates using set interface 
	Set<Integer> s=new HashSet<Integer>();        //upcasting
	for(int n:arr)                               //this method is faster than brute force method
	{
		boolean m = s.add(n);
		if(m==false)
		{
			System.out.print(n+ " ");
		}
	}
}
}
