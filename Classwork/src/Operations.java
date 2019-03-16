import java.util.Scanner;
public class Operations {
void  aritmeticOperatios(int a,int b)
{
	System.out.println("****arithmetic operations****");
	 int sum=a+b;
	 int diff=a-b;
	 int mul=a*b;
	 int div=a/b;
	 System.out.println("addition         :"+sum);
	 System.out.println("difference       :"+diff);
	 System.out.println("multiplication   :"+mul);
	 System.out.println("division         :"+div);
}
 public static void main(String args[])
 {
	 Operations op=new Operations();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter first  number:");
	 int a=sc.nextInt();
	 System.out.println("enter second number:");
	 int b=sc.nextInt();
	 op.aritmeticOperatios(a, b);
  	// op.aritmeticOperatios(25,5);
 }
}
