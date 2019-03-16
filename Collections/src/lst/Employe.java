package lst;

public class Employe {
String name;
int age;
double salary;
 public Employe(String name,int id,double salary)
 {
	 this.name=name;
	 this.age=age;
	 this.salary=salary;
 }
	public String toString() {
	return this.name + " "+ this.age+ " " +this.salary;
	}
}
