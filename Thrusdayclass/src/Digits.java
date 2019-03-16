import java.util.Scanner;
public class Digits {
	int noOfDigits(int n)
	{ 
		int count=0;
	    do
	    {
	    	n=n/10;
	      count++;
    //	  n=n/10;
        }
  while(n!=0);
	return count;
   }
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	Digits d=new Digits();
    int count=d.noOfDigits(n);
	System.out.println("no. of digits in " +n+ " are "+count);
}
}
