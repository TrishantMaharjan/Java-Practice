package MethodOverriding;

public class CentralBank {
	
	protected void bankName() {
		System.out.println("Central Bank");
	}
	
	protected void interestRate() {
		System.out.println("0");
	}
	
	public final void moneyExRate() { // final is used to not allow the child class to override the method, but the method can be used.
		System.out.println("$ 1 = Rs 122");
		System.out.println("Yen 10 = Rs 10");
		System.out.println("KDD 1 = Rs 15");
	}
	
}
