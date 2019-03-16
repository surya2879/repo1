
public class Student {
private String name;
private int age;
private double per;

public void setName(String name)
{
	this.name=name;
	System.out.println("name is "+name );
	
}
public void setAge(int age)
{
	if(age>15 && age <60)
	    this.age=age;
	else
		System.out.println("inavlid age");
	System.out.println("age is "+age );
}
public void setPer(double per)
{
	if(per>0 && per<100 )
	    this.per=per;
	else
		System.out.println("invalid percentage");
	System.out.println("per is "+per );
}
}





