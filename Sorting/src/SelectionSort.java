
public class SelectionSort {
	public static void swap(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
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

