public class Second {
public static void main(String args[]) {
	int a=5;
	int b=5;
	int x=a++;
	int y=++b;
	System.out.println(x);//5
	System.out.println(y);//6
	System.out.println(a);//6
	System.out.println(b);//6
}
}
