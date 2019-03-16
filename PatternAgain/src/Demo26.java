 
public class Demo26{
	public static void main(String[] args) {
		int num=5;
		int k=1;
		for(int i=0;i<num;i++) //rows           
		{
			for(int j=0;j<num;j++)           
			{
				if((i+j<=num-1 && i>=j) || (i+j>=num-1 && i<=j))
				  System.out.print(i+1);
				else
					System.out.print(" ");
			}
			System.out.println();
	    }
	}}/*
	1   1
    22 22
    33333
    44 44
    5   5         */
