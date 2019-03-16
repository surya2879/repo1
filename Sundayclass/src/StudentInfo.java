import java.util.Scanner;
public class StudentInfo {
		void stdInfo(String name,int id,double per)//called method
		{
			System.out.println("student name: " +name);
			System.out.println("student id: " +id);
			System.out.println("student per: " +per);
	    }
	public static void main(String args[])
	{
		StudentInfo s=new StudentInfo();
		s.stdInfo("kumar",34,67.4);
		s.stdInfo("surya", 100,76.3);
		s.stdInfo("ankur", 200, 73.4);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name,id,per");
		String name=sc.next();
		int id=sc.nextInt();
		double per=sc.nextDouble();
		s.stdInfo(name, id, per);
	}

}
