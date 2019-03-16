import java.util.Scanner;
public class ReverseWords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=sc.nextLine();
	char ch[]=str.toCharArray();
	String res=" ";
	for(int i=0;i<ch.length;i++)
	{
		int j=i;
		while(i<ch.length&&ch[i]!=' ')
		{
			i++;
		}
		int k=i-1;
		while(k>=j)
		{
			res=res+ch[k];
			k--;
		}
		if(i<ch.length)
			res=res+ch[i];
	}
	System.out.println(res);
}
}
