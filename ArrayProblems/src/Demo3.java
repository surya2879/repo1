
public class Demo3 {
public static void main(String[] args) {
	int n[]=new int [5];//declaration and allocation
	int y[]= {98,45,65,43,32}; //declaration,allocation and initialization
	int arr[];//declaration
	arr=new int [5];//allocation
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);//access //0,0,0,0,0 
	}
	for(int i=0;i<y.length;i++)
	{
		System.out.println(y[i]);
	}
	int[] array;
	array=new int[5];
	array[0]=25;
	array[1]=35;
	array[2]=45;
	array[3]=75;
	array[4]=45;
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
	
}
}
