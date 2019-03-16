
public class Pattern28 {
public static void main(String[] args) {
	int n=7,sp=0,st=n;//st is star   //sp is space   //n is no. of lines //or sp=n/2; //
	for(int i=1;i<=n;i++)              // st=n means in first lines there are n stars
	{
		for(int j=1;j<=sp;j++) 
		{
			System.out.print( " " );
		} 
		for(int j=1;j<=st;j++)
		{
			System.out.print("*");
		}
		if(i<=n/2)
		{
			sp++;
			st=st-2;
		}
		else
		{
			sp--;
			st=st+2;
		}
		System.out.println();
	}
}
}
