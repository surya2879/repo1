import java.util.Scanner;
public class Factorial {
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
 public static  void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the range");
	 int n=sc.nextInt();
	 for(int i=1;i<=n;i++)
	 {
		 System.out.println(i+ "!=" +fact(i));
	 }
 }

}
