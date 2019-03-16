public class Demo16 {
public static void main(String[] args) {
	int num=5;                 
	for(int i=0;i<num;i++) //rows
	{
		for(int j=0;j<num;j++)                   //x symbol
		{
			if((i==j) || (i+j==num-1))
			   System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
    }
}  
}


