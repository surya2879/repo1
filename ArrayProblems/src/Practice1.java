import java.util.Scanner;

public class Practice1 {
static int [] countEO(int []arr)
{
	int ec=0,oc=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
			ec++;
		else
			oc++;
	}
	int count[]= {ec,oc};
	return count;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many values");
	int n=sc.nextInt();
	System.out.println("enter" +n+ "values");
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	//Practice1 p=new Practice1();
	int count[]=Practice1.countEO(arr);
	System.out.println("even count" +count[0]);
	System.out.println("even count" +count[1]);
	
}

}


