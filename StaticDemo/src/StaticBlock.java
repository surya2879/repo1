
public class StaticBlock {
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		StaticBlock sb=new StaticBlock();
		StaticBlock sb2=new StaticBlock();
		StaticBlock sb3=new StaticBlock();
		System.out.println("main ends");
		}
	static
	{
		System.out.println("static block");
	}
	static
	{
		System.out.println("static block 2");
	}
}
