import java.util.Scanner;
public class Count1 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);	
System.out.println("from :");
int from=sc.nextInt();
System.out.println("to :");
int to=sc.nextInt();
System.out.println("by :");
int by=sc.nextInt();
if(to<from || by<1)
	System.out.println("invalid inputs");
else
	for(;from<=to;from=from+by)
		System.out.println(from+ " ");
System.out.println("thank you");
}
}
