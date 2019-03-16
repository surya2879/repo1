import java.util.Scanner;
public class ConvertNumtoSentence {
static void nTow(int n,String str)
{
	String one[]= { "","one","two","three","four","five","six","seven","eight","nine",
			"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen"
			,"seventeen","eighteen","ninteen"};
	String two[]= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
	if(n<20)
		System.out.print(one[n]);
	else
		System.out.print(two[n/10]+one[n%10]);
	if(n!=0)
		System.out.print(str+ " ");
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	nTow(n/10000000,"crore");
	nTow(n/100000%100,"lakh");
	nTow(n/1000%100,"thousand");
	nTow(n/100%10,"hundred");
	nTow(n%100," ");
}
}
