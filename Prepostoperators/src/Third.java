
public class Third {
public static void main(String[] args) {
	int num1,num2,num3;
	num1=100;
	num2=++num1;
	num3=num2++ + ++num1;
	System.out.println("num1="+num1);//102
	System.out.println("num2="+num2);//102
	System.out.println("num3="+num3);//203
	int a=10;
//	int b=++(++a);//error
	//boolean b1=false;
	//b1++;//error
	//System.out.println(b1);
}

}
