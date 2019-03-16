
public class HPDevice extends Object implements IScanner,IPrinter {
public 	void print()
	{
		System.out.println("prints");
	}
public 	void scan()
	{
		System.out.println("scans");
	}

public static void main(String[] args) {
	IPrinter p1=new HPDevice();
	p1.print();
	IScanner s1=new HPDevice();
	s1.scan();
	HPDevice hp=new HPDevice();
	hp.scan();
	hp.print();
}
}
