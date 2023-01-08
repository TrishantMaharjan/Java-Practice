package MethodOverriding;

public class NMBBank extends CentralBank {
	
	@Override
	protected void bankName() {
		System.out.println("NMB Bank");
	}
	
	@Override
	protected void interestRate() {
		System.out.println("12%");
	}
	
}
