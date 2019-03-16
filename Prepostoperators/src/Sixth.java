
public class Sixth {
public static void main(String[] args) {
	int num1=1,num2=1;
	int x=--num1;
	int y=num2--;
	System.out.println(+num1);//0
	System.out.println(+num2);//0
	System.out.println(+x);//0
	System.out.println(+y);//1
}
}
