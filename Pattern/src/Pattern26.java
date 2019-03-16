
public class Pattern26 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int k=i;
			for(int j=1;j<=n;j++)
			{
				System.out.print(( char )( k + 64 ));
				k=k+n;
			}
			System.out.println();
		}
	}
}
