
public class City {
String name;
int pincode;
@Override
	public boolean equals(Object obj) {
	if(obj instanceof City)//check type
	{
		City anc=(City)obj;//downcasting
		if(this.name.equals(anc.name)&&(this.pincode==anc.pincode))//check content
			return true;
		else
			return false;
	}
	else
		return false;
	}

public static void main(String[] args) {
	City c1=new City();
	c1.name="bangalore";
	c1.pincode=285001;
	
	City c2=new City();
	c2.name="bangalore";
	c2.pincode=285001;
	
	City c3=new City();
	c3.name="mangalore";
	c3.pincode=285003;
	
	System.out.println(c1.equals(c2));//true
	System.out.println(c2.equals(c3));//false
	System.out.println(c3.equals(c1));//false
}
}
