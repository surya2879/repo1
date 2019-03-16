
public class Demo30{
	public static void main(String[] args) {
		int num=5;
		char k='A';
		for(int i=0;i<num;i++)
		{
			if(i%2==0)
				k='A';
		    else
				k='1';
			for(int j=0;j<num;j++)
			{
				if((i+j<=num&&i<=j)||(i>=j&&i+j>=num-1))
				
				   System.out.print(k++);
				else
					System.out.print(" ");
				
			}
			System.out.println();
}}}/*
ABCDE
1234
 AB 
123 
ABCDE */