public class Demo29{
	public static void main(String[] args) {
			int num=5;
			int k=1;
			for(int i=0;i<num;i++) //rows           
			{
				for(int j=0;j<num;j++)           
				{
					if(i+j>=num-1 || i<=j)
					{
						if(k==5)
							k=1;
						   System.out.print(k++);
					}
				
					else
						System.out.print(" ");
				}
				System.out.println();
		    }
		}
		}
