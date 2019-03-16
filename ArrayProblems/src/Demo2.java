
public class Demo2 {
public static void main(String[] args) {
	int arr[];
	arr=new int [] {34,56,78,98};
	System.out.println("first element is : " +arr[0]);
	System.out.println("last element is : " +arr[arr.length-1]);
	System.out.println("size is "+arr.length);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(i +"----" +arr[i]);
	}
	System.out.println("-------------------------");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(i +"----" +arr[i]);
	}
}
}
