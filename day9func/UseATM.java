package day9func;

public class UseATM {
	public static void main(String[]args) {
		ATM a1 = new ATM();
		a1.bankname="CityUnion";
		a1.mainBalance=1000;
		a1.deppositeAmount=200;
		ATM a2=new ATM();
		a2.bankname="Indian";
		a2.mainBalance=2000;
		a2.deppositeAmount=100;
		
		System.out.println(a1.bankname+"  "+a1.findCredit(a1.mainBalance, a1.deppositeAmount));
		System.out.println(a1.bankname+"  "+a1.findDebit(a1.mainBalance, a1.deppositeAmount));
		System.out.println(a2.bankname+"  "+a2.findCredit(a2.mainBalance, a2.deppositeAmount));
		System.out.println(a2.bankname+"  "+a2.findDebit(a2.mainBalance, a2.deppositeAmount));
			
		
		
	}

}

class ATM {
	String bankname;
	int mainBalance;
	int deppositeAmount;
	public int findCredit(int a, int b) {
		return a+b;
		
	}
	public int findDebit(int a ,int b) {
		return a-b;
	}
}
