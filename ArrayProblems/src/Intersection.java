import java.util.Scanner;
public class Intersection {
public int[] interSect(int f[],int s[])
 {
	 int na[];
	 if(f.length<s.length)
	    na=new int[f.length];
     else
	    na=new int[s.length];
	    int k=0;
		for(int i=0;i<f.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				if(f[i]==s[j])
				{
					na[k]=f[i];
					k++;
					break;
				}
			}
		}
	 	int nan[]=new int[k];
		for(int i=0;i<nan.length;i++)
		{
			nan[i]=na[i];
		}
		return nan;
	}
 void dispArr(int[]arr)
 {
 	for(int i=0;i<arr.length;i++)
 	{
 		System.out.print(arr[i] + " ");
 	}
 	System.out.println();
 }

 int[] readArr()
 {
 	Scanner sc=new Scanner(System.in);
 	System.out.println("enter how many values");
 	int n=sc.nextInt();
 	int arr[]=new int[n];
 	System.out.println("enter " +n+ " integer values");
 	for(int i=0;i<arr.length;i++)
 	{
 		arr[i]=sc.nextInt();
 	}
 	return arr;
 }
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Intersection is=new Intersection();
	 System.out.println("read first array");
	 int f[]=is.readArr();
	 System.out.println("read second array");
	 int s[]=is.readArr();
	 System.out.println("first array elements");
	 is.dispArr(f);
	 System.out.println("second array elements");
	 is.dispArr(s);
	 int c[]=is.interSect(f, s);
	 System.out.println("---after intersection operation---");
	 is.dispArr(c);
 }
}
