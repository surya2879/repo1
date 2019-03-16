public class Demo21{
	public static void main(String[] args) {
			int num=5;
			char ch='A';
			for(int i=0;i<num;i++) //rows           
			{
				for(int j=0;j<num;j++)           
				{
					if(i+j>=num-1 && i>=j)
							{
						     if(ch=='E') 
						    	 ch='A';
							   System.out.print(ch++);
							}
					else
						System.out.print(" ");
				}
				System.out.println();
		    }
		}
	}   /*
  A  
 BCD 
ABCDA   */
