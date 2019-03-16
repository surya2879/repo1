
public class First {
public static void main(String args[])
{
	int num1 =1;
	int num2=1;
	int x=--num1;
	int y=num2--;
	System.out.println("num1 :"+num1);//0
	System.out.println("num2 :"+num2);
	System.out.println("x :"+x);//0
	System.out.println("y:"+y);
	int a=10;
	int b=a++ + ++a;
	System.out.println("a value is:" +a);
	System.out.println("b value is:" +b);
	}
}
