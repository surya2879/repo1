
public class Demo31 {
public static void main(String[] args) {
	int k;
	for(int i=0;i<5;i++)
	{
		k=1;
		for(int j=0;i<5;j++)
		{
			if(i+j>=5-1)
				System.out.print(k++);
			else
				System.out.print(" ");
			
		}
		for(int j=0;i<5;j++)
		{
			if(i>=j+1)
				System.out.print(k-- -2);
			else
				System.out.print("");
		}
		System.out.println();
		k++;
		
	}
	
}
}
