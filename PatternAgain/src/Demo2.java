
public class Demo2 {
public static void main(String[] args) {
	int num=5;                  //diagonal
	for(int i=0;i<num;i++) //rows
	{
		for(int j=0;j<num;j++)
		{
			if(i==j)
			   System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
    }
}                            
}/*
*    
 *   
  *  
   * 
    *     */
