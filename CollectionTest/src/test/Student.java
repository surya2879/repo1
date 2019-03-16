package test;

public class Student {
String name;
int id;
int age;
public Student(String name,int id,int age)
{
	this.name=name;
	this.id=id;
	this.age=age;
}
public String toString() {
return this.name + " " + this.id + " " + this.age;
}
}
