import java.util.Scanner;
public class Swap {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first string");
	String st1=sc.next();
	System.out.println("enter second string");
	String st2=sc.next();
	st1=st1+st2;
	st2=st1.substring(0,(st1.length()-st2.length()));
	st1=st1.substring(st2.length(),st1.length());
	System.out.println("after swapping");
	System.out.println("first string is :"+st1);
	System.out.println("second string is :"+st2);
}
}
