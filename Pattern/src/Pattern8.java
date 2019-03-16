
public class Pattern8 {
public static void main(String[] args) {
	int n=5342;
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
