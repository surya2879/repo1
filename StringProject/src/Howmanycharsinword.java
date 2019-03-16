import java.util.Scanner;
public class Howmanycharsinword {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter sentence");
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
	String res=" ";
	int count=0;
	for(int i=0;i<ch.length;i++)
	{
	  if(str.charAt(i)== ' ' )
	  {
		  res=res + count;
		  count=0;
	  }
	  else
	  {
		  count++;
		  res=res + str.charAt(i);
	  }
	}
	res=res + count;
	System.out.println("number of characters in each word is: " +res);
	}
}
