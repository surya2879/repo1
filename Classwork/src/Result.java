
public class Result {
 
 String getResult(int m1,int m2,int m3,int m4)
 {
	 if(m1<35||m2<35||m3<35||m4<35)
		 return "fail";
				 double avg=m1+m2+m3+m4/4.0;
	 if(avg>=85)
		 return "distinction";
	 if(avg>=60)
		 return "first class";
				 if(avg>=50)
		 return "secondclass";
	return "pass";
 }
 public static void main(String args[])
 {
	 Result rs=new Result();
	 String res=rs.getResult(96,85,62,48);//calling
	 System.out.println("Result: "+res);
	 String res1=rs.getResult(38,38,39,40);//calling
	 System.out.println("Result: "+res1);
 }
}
