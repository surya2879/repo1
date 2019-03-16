import java.util.Scanner;
public class DectoHex {
 static String decimaltoHex(int n)
{
	String hx="";
do{
	int r=n%16;
	n=n/16;
	if(r<10)
		hx=r+hx;
	else if(r==10)
		hx='A'+hx;
	else if(r==11)
		hx='B'+hx;
	else if(r==12)
		hx='C'+hx;
	else if(r==13)
		hx='D'+hx;
	else if(r==14)
		hx='E'+hx;
	else if(r==15)
		hx='F'+hx;
	//=n/16;
  }while(n!=0);
  return hx;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	DectoHex dh=new DectoHex();
	String res=dh.decimaltoHex(n);
	System.out.println(res);

//	System.out.println(decimaltoHex(87626));

}
}

