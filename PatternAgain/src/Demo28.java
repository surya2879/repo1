
public class Demo28 {
	public static void main(String[] args) {
			int num=5;
			int k=1;
			//char ch='A';
			for(int i=0;i<num;i++) //rows
			{
				for(int j=0;j<num;j++)              //triangle
				{
					if(i>=j)
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
		
