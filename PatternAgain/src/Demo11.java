
public class Demo11 {
	public static void main(String[] args) {
			int num=5;
			for(int i=0;i<num;i++) //rows
			{
				for(int j=0;j<num;j++)           //combine Demo9 and Demo10 triangles with OR condiotion
				{
					if((i+j>=num-1 && i>=j) || (i+j<=num-1 && i<=j))
					   System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
		    }
		}
		}

/* *****
    *** 
     *  
    *** 
   *****
       */      