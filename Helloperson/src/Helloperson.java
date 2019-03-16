import java.util.Scanner;
public class Helloperson {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("hi! what is your name?");
String name=sc.next();
System.out.println("hello " +name +" what is your age?");
int age=sc.nextInt();
if(age<18)
	System.out.println("hello " + name + "you are not eligible to code");
else
	System.out.println("hello " +name+ " you are eligible to code");

}
}
