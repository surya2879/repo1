

public class Demo24{
	public static void main(String[] args) {
			int num=5;
			char k='A';
			for(int i=0;i<num;i++) //rows           
			{
				for(int j=0;j<num;j++)           
				{
					if(i+j<=num && i<=j)
					{
						if(k=='E')
							k='A';
		           System.out.print(k++);
					}
					else
						System.out.print(" ");
				}
				System.out.println();
		    }
		}}