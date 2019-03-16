
public class Pattern19 {
public static void main(String[] args) {
	int n=5,k=0;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
		  if(k%2==0)
			  System.out.print( (k/2)%9+1 );
		  else
			  System.out.print(" * ");
		  k++;
		 }
		System.out.println();
	}
}
}
