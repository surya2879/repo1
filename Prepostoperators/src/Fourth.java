
public class Fourth {
public static void main(String args[])
{
 int a=10;
 int b=a++ + ++a;
 System.out.println("A value is :" +a);
 System.out.println("B value is :" +b);
 
 int c=++a + ++a;
 System.out.println("A value is :" +a);
 System.out.println("C value is :" +c);
 
 int d=a-- + --a;
 System.out.println("A value is :" +a);
 System.out.println("D value is :" +d);
 
 int e=a++ + ++a + a++;
 System.out.println("A value is :" +a);
 System.out.println("E value is :" +e);
 
 int f=--a+a++;
 System.out.println("A value is :" +a);
 System.out.println("F value is :" +f);
 
 int g=a-- + a++;
 System.out.println("A value is :" +a);
 System.out.println("G value is :" +g);
 
}
}
