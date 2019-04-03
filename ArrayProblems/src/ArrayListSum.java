import java.util.ArrayList;

public class ArrayListSum {
	public static void main(String[] args) {
		ArrayList<Integer> lst=new ArrayList<Integer>();
		int sum=0;
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.add(50);
		for(int i=0;i<lst.size();i++)
		{
			sum=sum+(lst.get(i));   //add the numbers present in arraylist
		}
		System.out.println("sum of elements of arraylist is:" +sum);
	}
}
