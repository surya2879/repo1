public class EvenandOdd {
int [] countEO(int arr[])
{
int ec=0,oc=0;
for(int i=0;i<arr.length;i++)
   {
	if(arr[i]%2==0)
		ec++;
	else oc++;
	}
int count[]= {ec,oc};
return count;
}
public static void main(String[] args) {
	 EvenandOdd eo=new  EvenandOdd();
	 int[] arr= {54,39,66,89,94};
	 int [] count=eo.countEO(arr);
	 System.out.println("no. of even elements :" +count[0]);
	 System.out.println("no. of odd elements :" +count[1]);
	
}
}
