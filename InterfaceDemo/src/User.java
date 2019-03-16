
public class User {
public static void main(String[] args) {
	Paytm p1=new Upi();//upcasting
	Paytm p2=new CreditCard(); //upcasting
	p1.addMoney();
	p2.addMoney();
}
}
