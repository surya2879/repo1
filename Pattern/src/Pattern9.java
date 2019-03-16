
public class Pattern9 {
public static void main(String[] args) {
	int n=456;
	for(;n!=0;n=n/10)
	{
		for(int j=1;j<=n%10;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
