import java.util.Scanner;
public class Insertelement {
int[] insert(int a[],int in,int ele)
{
	if(in<0 || in>a.length)
	{
		System.out.println("invalid index");
        return a;
	}
    
	int na[]= new int[a.length+1];
	for(int i=0;i<a.length;i++)
	{
		if(i<in)
			na[i]=a[i];
		else
			na[i+1]=a[i];
	}
	na[in]=ele;
	return na;
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
	Insertelement ins=new Insertelement();
    System.out.println("read array");
    int a[]=ins.readArr();
    System.out.println("enter index to add");
    int in=sc.nextInt();
    System.out.println("enter the element to insert");
    int ele=sc.nextInt();
    System.out.println("before adding");
    ins.dispArr(a);
    a=ins.insert(a, in, ele);
    System.out.println("after adding");
    ins.dispArr(a);
    }
}
