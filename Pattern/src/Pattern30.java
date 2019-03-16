
public class Pattern30 {
public static void main(String[] args) {
	String st="r a g h u";
	int n=st.length();
	int ele=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++)
		{
			System.out.print( " " );
		}
		int k=0;
		for(int j=i;j<=ele;j++)
		{
			System.out.print(st.charAt(k)+ " ");
			if(i<=ele/2)
				k++;
			else
				k--;
		}
		ele=ele+2;
		System.out.println();
		
	}
}
}

