

public class Demo22{
	public static void main(String[] args) {
			int num=5;
			char k='A';
			for(int i=0;i<num;i++) //rows           
			{
				for(int j=0;j<num;j++)           
				{
					if(i+j<=num && i<=j)
					   System.out.print(k++%2+1);
					else
						System.out.print(" ");
				}
				System.out.println();
		    }
		}}/*
21212
1212
 12 
*/