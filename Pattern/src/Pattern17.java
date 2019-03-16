
public class Pattern17 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++)
	{
		int k=1;
		for(int j=1;j<=n;j++)
		{
			if(j%2==1)
			{
				System.out.print(k + " ");
				k++;
			}
			else
				System.out.print(" * ");
		}
		System.out.println();
	}
}
}
