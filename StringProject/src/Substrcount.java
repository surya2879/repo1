import java.util.Scanner;
public class Substrcount {
	private static int countSubstr(String str1,String str2)
	{
		char c1[]=str1.toCharArray();
		char c2[]=str2.toCharArray();
		int count=0;
		for(int i=0;i<c1.length;i++)
		{
			int j=0,k=i;
			while(j<c2.length && k<c1.length && c1[k]==c2[j])
			{
				j++;
				k++;
			}
			if(j==c2.length)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter first string");
		String str1=sc.nextLine();
		System.out.println("enter second string");
		String str2=sc.nextLine();
		int count=countSubstr(str1, str2);
		System.out.println(count);
	}
}
