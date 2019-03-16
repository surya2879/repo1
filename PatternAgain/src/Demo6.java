public class Demo6 {
	public static void main(String[] args) {
			int num=5;
			for(int i=0;i<num;i++) //rows
			{
				for(int j=0;j<num;j++)              //triangle (upper triangle of Demo5)
				{
					if(i<=j)
					   System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
		    }
		}
		}/*
*****
****
 ***
  **
   *
*/