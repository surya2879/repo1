package lst;
import java.util.ArrayList;
public class AlDemo {
public ArrayList<Employee> addEmpsToList()
{
	Employee e1=new Employee(10,"surya",1000);
	Employee e2=new Employee(20,"varun",2000);
	Employee e3=new Employee(30,"mia",3000);
	Employee e4=new Employee(40,"rahul",4000);
	ArrayList<Employee>lst=new ArrayList<Employee>();
	lst.add(e1);
	lst.add(e2);
	lst.add(e3);
	lst.add(e4);
	return lst;
	}
public static void main(String[] args) {
	AlDemo demo=new AlDemo();
	ArrayList<Employee>lst=demo.addEmpsToList();
	for(int i=0;i<lst.size();i++)
	{
		Employee e=lst.get(i);
		System.out.println(e);
	}
	for(Employee emp:lst)
	{
		System.out.println(lst);
	}
}
}
