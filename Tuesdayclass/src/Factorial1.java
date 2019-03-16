
public class Factorial1 {
static int fact(int n)
{
	int f=1;
	while(n>1)
	{
		f=f*n;
		n--;
	}
	return f;
}
public static void main(String args[])
{
  //Factorial1 f=new Factorial1();
//  System.out.println("5!="+f.fact(5));
  //System.out.println("6!="+f.fact(6)); 
  //System.out.println("7!="+f.fact(7));
	System.out.println(fact(5));
}
}