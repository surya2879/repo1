import java.util.Scanner;
public class Naturalnumber {
 int sumOfNatural(int num)
	 {
		 int sum=0;
		 while(num>=1)
		 {
			 sum=sum+num;
			 num--;
		}
		 return sum;
	 }
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 Naturalnumber nt=new Naturalnumber();
		 System.out.println("enter number");
		 int n=sc.nextInt();
		 int sum=nt.sumOfNatural(n);
		 System.out.println("sum of first " +n+ " natural numbers is: "+sum);
	 }
	// Scanner sc=new Scanner(System.in);
	 //int i=1,sum=0;
	 //System.out.println("enter a number");
	 //int n=sc.nextInt();
	// for(int i=1;i<=n;i++)
	 //{
		// sum=sum+i;
		
	// }
	 //while//(i<=n)
	/* while(n>=1)
	 {	 
	 //sum=sum+i;
	 //i++;
		 sum=sum+n;
		 n--;
	 }
	 System.out.println("sum is: "+sum);*/
 //}
}
