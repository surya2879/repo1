
public class Pattern10 {
public static void main(String[] args) {
	int n=5317;
	String st="";
	for(int i=0;i<st.length();i++)
	{
		int x=st.charAt(i)-48;
		for(int j=0;j<x;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
