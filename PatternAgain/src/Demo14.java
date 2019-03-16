

public class Demo14{
	public static void main(String[] args) {
			int num=5;
			for(int i=0;i<num;i++) //rows            //combine demo4 and demo5 triangles with AND condition
			{
				for(int j=0;j<num;j++)           
				{
					if(i+j<=num-1 && i>=j)
					   System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
		    }
		}
		} 

/*  *    
    **   
    ***  
    **   
    *      */    

