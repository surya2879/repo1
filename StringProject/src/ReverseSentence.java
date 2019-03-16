import java.util.Scanner;
public class ReverseSentence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=sc.nextLine();
	char ch[]=str.toCharArray();
	str=" ";
	for(int i=ch.length-1;i>=0;i--)
	{
		int j=i;
		while(i>=0&&ch[i]!=' ')
		{
			i--;
		}
		int k=i+1;
		while(k<=j)
		{
			str=str+ch[k];
			k++;
		}
		if(i>=0)
		{
			str=str+ch[i];
		}
	}
	System.out.println(str);
}
}
