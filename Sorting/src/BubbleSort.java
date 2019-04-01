
public class BubbleSort {
	public static void swap(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
		}
	}
public static void main(String[] args) {
	int [] arr= {23,32,12,56,9,10};
	
    System.out.println("before sorting");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+ " ");
	}
	
    swap(arr);	
    
    System.out.println();
	System.out.println("after sorting");
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+ " ");
	}
 }
}

