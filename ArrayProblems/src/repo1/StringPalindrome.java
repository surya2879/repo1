package repo1;

import java.util.Scanner;

public class StringPalindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=sc.nextLine();
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			ch[i]=(char)(ch[i]-32);
		else if(ch[i]=='B' || ch[i]=='C'|| ch[i]=='D' || ch[i]=='H' || ch[i]=='F' ||ch[i]=='G' || ch[i]=='J'
				|| ch[i]=='K' || ch[i]=='L' || ch[i]=='M' ||ch[i]=='N' || ch[i]=='P'|| ch[i]=='Q' || ch[i]=='R' 
				|| ch[i]=='S' || ch[i]=='T'|| ch[i]=='V' || ch[i]=='W' || ch[i]=='X'
				|| ch[i]=='Y' || ch[i]=='Z')
			
		        ch[i]=(char)(ch[i]+32);
	}
	 str=new String(ch);
	 System.out.println(str);
	}
 }


