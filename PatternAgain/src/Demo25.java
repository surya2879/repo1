
public class Demo25{
	public static void main(String[] args) {
			int num=5;
			int k=1;
			for(int i=0;i<num;i++) //rows           
			{
				for(int j=0;j<num;j++)           
				{
					if((i+j<=num-1 && i>=j) || (i+j>=num-1 && i<=j))
					  System.out.print(j+1);
					else
						System.out.print(" ");
				}
				System.out.println();
		    }
		}}/*
1   5
12 45
12345
12 45
1   5             */