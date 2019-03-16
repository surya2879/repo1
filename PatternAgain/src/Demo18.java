
public class Demo18 {
public static void main(String[] args) {
	int num=5;                 
	for(int i=0;i<num;i++) //rows
	{
		for(int j=0;j<num;j++)
		{
			if(i+j>=num-1 && i<=j)
			   System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
    }
}} /*                           
    *
   **
  ***
   **
    *      */
