import java.util.Scanner;
public class Methodoverloading {
void login(String un,String pwd) {
	Scanner sc=new Scanner(System.in);
	System.out.println("login with un and pwd");
	System.out.println("enter un and pwd");
	String un1=sc.nextLine();
	String pwd1=sc.nextLine();
	System.out.println("logged in successfully");
	
	
}
void login(long  mobile,int otp)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("login with mob and otp");
	System.out.println("enter mob and otp");
	Long mob=sc.nextLong();
	int otp1=sc.nextInt();
	System.out.println("logged in successfully");
	
	}
public static void main(String[] args) {
	Methodoverloading mo=new Methodoverloading ();
	mo.login("surya","swayam");
	mo.login(9044365267L,2879);
}
}
