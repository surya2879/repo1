import java.util.Scanner;
public class Substring {
private static boolean isSubstr(String str1,String str2) {
	char c1[]=str1.toCharArray();
	char c2[]=str2.toCharArray();
	for(int i=0;i<c1.length;i++)
	{
		int j=0,k=i;
		while(j<c2.length && k<c1.length && c1[k]==c2[j])
		{
			j++;
			k++;
		}
		if(j==c2.length)
			return true;
	}
	return false;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first string");
	String str1=sc.nextLine();
	System.out.println("enter second string");
	String str2=sc.nextLine();
	boolean res=isSubstr(str1, str2);
	if(res)
		System.out.println("yes, it is a substring of " +str1);
	else
		System.out.println("no, it is not a substring of " +str1);
}
}
