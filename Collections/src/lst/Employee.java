package lst;

public class Employee {
int id;
String name;
double salary;
public Employee(int id,String name,double salary)
{   
	this.id=id;
	this.name=name;
    this.salary=salary;
}
@Override
	public String toString() {
		
		return this.id+ " "+this.name + " " +this.salary + "Rs";
}

}
