public class Duplicate {
public static void main(String[] args) {
    int[] arr= {10,10,30,30,40,40,50,60,70};
	int count=0;
    System.out.println("duplicate elements: ");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.print(arr[i] + " ");
				count++;
		    }
    	}
	}
	System.out.println();
	System.out.println(count);
 }
}
 