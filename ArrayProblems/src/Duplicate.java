public class Duplicate {
public static void main(String[] args) {
    int[] arr= {10,10,30,30,40,40,50,60,70};
    System.out.println("duplicate elements: ");
	for(int i=0;i<arr.length-1;i++)            //brute force method(not efficient)
	{                                      //this method works only when any element is repeated only once
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j] && (i!=j))
			{
				System.out.print(arr[j] + " ");
		    }
    	}
	}
	System.out.println();
  }
}
 