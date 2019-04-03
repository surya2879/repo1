import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) 
	{
	        Scanner sc=new Scanner(System.in);
			System.out.println("enter no. of rows");
			int row=sc.nextInt();
			System.out.println("enter no. of columns");
			int col=sc.nextInt();
			int matrix[][]=new int[row][col];
			System.out.println("enter elements of matrix");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					matrix[i][j]=sc.nextInt();
				}
		    }
			System.out.println("Transpose of the given matrix is:");
			for(int i=0;i<col;i++)
			{
				for(int j=0;j<row;j++)
				{
					System.out.print(matrix[j][i] + " ");
				}
				System.out.println("\n");
			}
	}
}
