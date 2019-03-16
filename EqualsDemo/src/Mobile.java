
public class Mobile {
String name,clr;
@Override
	public boolean equals(Object obj)
 {
	if(obj instanceof Mobile)//check type 
	{
		Mobile anm=(Mobile)obj;//downcasting  
		if(this.name.equals(anm.name) && (this.clr.equals(anm.clr)))//check content
			return true;
		else 
			return false;
	}
	else
		return false;
 }
public static void main(String[] args) {
	Mobile m1=new Mobile();
	m1.name="i20";
	m1.clr="red";
	
	Mobile m2=new Mobile();
	m2.name="swift";
	m2.clr="green";
	
	Mobile m3=new Mobile();
	m3.name="i20";
	m3.clr="red";
	
	System.out.println(m1.equals(m2));//false
	System.out.println(m2.equals(m3));//false
	System.out.println(m1.equals(m3));//true
}
}
