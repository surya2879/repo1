
public class Commom {
public static void main(String[] args) {
	int[] a= {23,46,56,87, 2,85,29,344};
	int[] b= {23,87,34,12,85,29,46};
	System.out.println("intersection is :");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			   System.out.print(a[i] + " ");
		}
	}
 }
}
	
