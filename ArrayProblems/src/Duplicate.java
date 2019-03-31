public class Duplicate {
public static void main(String[] args) {
	int count=0;
    int[] arr= {10,10,10,30,30,40,40,50,60,70};
	
	System.out.println("duplicate elements: ");
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				
		     //   System.out.print(arr[i]+ " ");
		        count++;
			}
		}
	}
	System.out.println();
	System.out.println("no. of duplicate elements are: " +count);
	
	  int[] na=new int[count];
	
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println("duplicate array");
			  
				na[i]=arr[i++];
				System.out.println("duplicate array elements are");
				for(int k=0;k<na.length;k++)
				{
					System.out.print(na[k]+ " ");
				}
			}
		}
		
	}
	
	
	
	
	
}
}
