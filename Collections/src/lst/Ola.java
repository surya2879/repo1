package lst;
import java.util.List;
import java.util.LinkedList;
public class Ola {
public static void main(String[] args) {
	Trip t1=new Trip(120.5,5.5,"jp nagar","hsr layout");
	Trip t2=new Trip(500,25,"jaya nagar","nela mangala");
	List<Trip> lst=new LinkedList<Trip>();
	lst.add(t1);
	lst.add(t2);
	//and many more
for(Trip t:lst)
{
	System.out.println(lst);}
	
}
}
