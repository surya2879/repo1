public class SettedBits {
static int countSettedBits(int n)
{
	int count=0;
	do {
		int r=n%2;
		 n=n/2;
		if(r==1)
			count++;
	}
	while(n!=0);
	return count;
}
public static void main(String[] args) {
	System.out.println(countSettedBits(178));
}
}
