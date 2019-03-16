
public class Demo4 {
		public static void main(String[] args) {
			int num=5;                 
			for(int i=0;i<num;i++) //rows
			{
				for(int j=0;j<num;j++)
				{
					if(i+j<=num-1)
					   System.out.print("*");  //triangle (upper triangle of Demo1)
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



