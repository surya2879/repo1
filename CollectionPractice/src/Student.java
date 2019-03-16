import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Student {
 String name;
 int age;
 double per;
 public Student(String name,int age,double per)
 {
	 this.name=name;
	 this.age=age;
	 this.per=per;
 }
public String toString()
{
	return this.name+ " " +this.age+ " " +this.per;
}
public static void main(String[] args) {
	Student s1=new Student("surya",26,73.4);
	Student s2=new Student("ankur",27,72.0);
	Student s3=new Student("ronam",28,71.5);
	Student s4=new Student("rahul",29,70.4);
	
	LinkedList<Student> lst=new LinkedList<Student>();
	lst.add(s1);
	lst.add(s2);
	lst.add(s3);
	lst.add(s4);
	System.out.println(lst);
	ListIterator<Student> itr=lst.listIterator();
	while(itr.hasNext())
	{
		Student s=itr.next();
	    System.out.println(s);
}

}
}
