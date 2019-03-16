public class Posineg {
	int [] countPN(int arr[])
	{ 
		int p=0,n=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
				p++;
			else
				n++;
		}
		int[] count= {p,n};
		return count;
	}
	public static void main(String[] args) {
		 Posineg pnc=new  Posineg();
		 int [] arr= {-2,0,-56,34,78};
		 int [] count=pnc.countPN(arr);
		 System.out.println("no. of positive elements :" +count[0]);
		 System.out.println("no. of negative elements :" +count[1]);
	}
}
