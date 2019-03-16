
public class Mobile {
private final  String countryName="india";

public String getCountryName() {
	System.out.println("country name is : "+countryName);
	return countryName;
}

public static void main(String[] args) {
	Mobile m=new Mobile();

	
	m.getCountryName();
}


}
