import java.util.Collection;
import java.util.ArrayList;
public class ArrayListDemo2 {
public static void main(String[] args) {
	Collection<String> ecCol=new ArrayList<String>();
	ecCol.add("Raju");
	ecCol.add("Surya");
	ecCol.add("Ankur");
	ecCol.add("Rahul");
	System.out.println("electronics students are ---->" +ecCol);
	
	Collection<String> csCol=new ArrayList<String>();
	csCol.add("Ronam");
	csCol.add("Vishal");
	csCol.add("Mia");
	csCol.add("Varsha");
	System.out.println("computer science students are---->" +csCol);
	
	Collection<String> googleCol=new ArrayList<String>();
	googleCol.addAll(ecCol);
	googleCol.addAll(csCol);
	System.out.println("students eligible for google drive are---->" +googleCol);
	
	googleCol.remove("Mia");
	System.out.println(googleCol);
	
	googleCol.removeAll(ecCol);
	System.out.println(googleCol);
	
	googleCol.clear();
	System.out.println(googleCol);
}
}
		
		


