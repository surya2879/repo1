public class Tablenumber {
void mTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
public static void main(String args[])
{
	Tablenumber tn=new Tablenumber();
	tn.mTable(10);
	//tn.mTable(11);
	//tn.mTable(12);
	//tn.mTable(13);
	//tn.mTable(14);
	}
}
