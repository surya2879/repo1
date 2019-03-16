package test;

import java.util.Iterator;
import java.util.LinkedList;

public class Emp {
String name;
int id;
double salary;

public Emp(String name,int id,double salary)
{
	this.name=name;
	this.id=id;
	this.salary=salary;
}
@Override
	public String toString() {
		return this.name + " " + this.id + " " + this.salary ;
	}

public static void main(String[] args) {
	Emp e1=new Emp("surya",10,1000);
	Emp e2=new Emp("varun",20,2000);
	Emp e3=new Emp("chandu",30,3000);
	Emp e4=new Emp("ankur",40,4000);
	Emp e5=new Emp("rahul",50,5000);
	
	LinkedList<Emp> l=new LinkedList<Emp>();
	l.add(e1);
	l.add(e2);
	l.add(e3);
	l.add(e4);
	l.add(e5);
	System.out.println(l);
	
	Iterator<Emp> itr=l.iterator();
	while(itr.hasNext())
	{
		Emp e=itr.next();
		System.out.println(e);
	}
	
	
}
}
