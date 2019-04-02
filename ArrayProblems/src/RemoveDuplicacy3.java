import java.util.HashSet;

public class RemoveDuplicacy3 {
	//remove duplicacy using HashSet
	//this method is applicable for both sorted and unsorted arrays
public static void main(String[] args) {
	int [] arr= {1,2,2,3,4,4,4,5,5};   //sorted array
	//int [] arr= {1,3,4,5,4,5,2,2,2,4,4,4,5,5}; // unsorted array
	HashSet<Integer> hs=new HashSet<Integer>();
	for(int i=0;i<arr.length;i++)
	{
		hs.add(arr[i]);
	}
	for(int num:hs)
	{
		System.out.print(num+ " ");
	}
}
}
