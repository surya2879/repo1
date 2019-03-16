package test;

import java.util.ArrayList;
import java.util.ListIterator;

public class AlDemo {
public ArrayList<Student> addstudtoList()
{
	Student s1=new Student("surya", 1, 28);
	Student s2=new Student("ankur", 2, 25);
	Student s3=new Student("rahul", 3, 20);
	Student s4=new Student("ronam", 4, 30);
	ArrayList<Student> lst=new ArrayList<Student>();
	lst.add(s1);
	lst.add(s2);
	lst.add(s3);
	lst.add(s4);
	return lst;
}
public static void main(String[] args) {
	AlDemo ald=new AlDemo();
	ArrayList<Student>lst=ald.addstudtoList();
	ListIterator<Student> itr=lst.listIterator();
	while(itr.hasNext())
	{
	  Student stud=itr.next();
	  System.out.println(stud);
	}
}
}
