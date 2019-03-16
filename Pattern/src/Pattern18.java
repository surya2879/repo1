
public class Pattern18 {
public static void main(String[] args) {
	int n=5,k=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i%2==1) {
			    System.out.print(k + " ");
			}
			else
				System.out.print( " * " );
		}
	if(i%2==1)
			k++;
		System.out.println();
	}
}
}