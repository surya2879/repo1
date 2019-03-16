
public class Pattern7 {
public static void main(String[] args) 
{
int n=5;
for(int i=n;i>0;i--)
	{
		for(int j=n;j>0;j--)
		{
			System.out.print((char)(j+64)+ " ");
		}
		System.out.println();
	}
}
}
