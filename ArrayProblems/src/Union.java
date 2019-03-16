import java.util.Scanner;
public class Union {
int [] union(int[] f,int[] s)
{
	int[] u=new int[f.length+s.length];
	int i=0;
	for(;i<f.length;i++)
	{
		u[i]=f[i];
	}
	for(int j=0;j<s.length;j++)
	{
		int find=1;
		for(int k=0;k<i;k++)
		{
			if(u[k]==s[j])
			{
				find=0;
				break;
			}
		}
		if(find==1)
		{
			u[i]=s[j];
			i++;
		}
	}
	int nu[]=new int[i];
	for(int j=0;j<nu.length;j++)
	{
		nu[j]=u[j];
	}
	return nu;
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
	  Union u=new Union();
	
	 System.out.println("read first array");
	 int a[]=u.readArr();
	 System.out.println("read second array");
	 int b[]=u.readArr();
	 System.out.println("first array elements");
	 u.dispArr(a);
	 System.out.println("second array elements");
	 u.dispArr(b);
	 int c[]=u.union(a,b);
	 System.out.println("---after union operation---");
	 u.dispArr(c);
	}
}
