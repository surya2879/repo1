import java.util.Scanner;
public class Noofwords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=sc.nextLine();
	char ch[]=str.toCharArray();
	int wc=0;
	for(int i=0;i<ch.length;i++)
	{
		if(i==0 &&ch[i]!=' '||ch[i]!=' ' &&ch[i-1]==' ')
		wc++;
	}
	System.out.println("number of words:" +wc);
}
}
