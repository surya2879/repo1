package lst;

import java.util.ArrayList;
import java.util.Iterator;

public class ALdemoo {
public ArrayList<Employe> addemptoList()
{
	Employe e1=new Employe("surya", 25, 100.00);
	Employe e2=new Employe("mia", 24, 200.07);
	Employe e3=new Employe("ritu", 27, 300.6);
	Employe e4=new Employe("ankur", 26, 400.0);
	ArrayList<Employe> lst=new ArrayList<Employe>();
	lst.add(e1);
	lst.add(e2);
	lst.add(e3);
	lst.add(e4);
	return lst;
}
public static void main(String[] args) {
	ALdemoo ald=new ALdemoo();
	ArrayList<Employe> lst=ald.addemptoList();
	Iterator<Employe> itr=lst.iterator();
	while(itr.hasNext())
	{
		Employe emp=itr.next();
		System.out.println(emp);
	}
	for(int i=0;i<lst.size();i++)
	{
		Employe e=lst.get(i);
		System.out.println(e);
	}
	for(Employe e1:lst)
	{
		System.out.println(e1);
	}
}


}