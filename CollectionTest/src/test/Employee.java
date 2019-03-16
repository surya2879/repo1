package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class Employee {
	String name;
	int id;
	double salary;
	
	public Employee(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return this.name + " "+this.id+" "+this.salary;
	}
	public static void main(String[] args) {
		Employee e1=new Employee("surya",45,1000);
		Employee e2=new Employee("ankur",48,3000);
		Employee e3=new Employee("mia",46,2000);
		Employee e4=new Employee("ritu",47,7000);
		ArrayList<Employee> lst=new ArrayList<Employee>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		System.out.println(lst);
		ListIterator<Employee> itr=lst.listIterator();
	//	System.out.println("list iterator");
		while(itr.hasNext())
		{
			Employee e=itr.next();//listiterator
		    System.out.println(e);
		}
	//	for(Employee emp:lst)
		//	System.out.println(emp);
	//	for(int i=0;i<lst.size();i++)
		//{
			//Employee emp=lst.get(i);
			//System.out.println(emp);
		//}
	}

}
