package MethodOverriding;

public class NICBank extends CentralBank {

	@Override
	protected void bankName() {
		System.out.println("NIC Bank");
	}
	
	@Override
	protected void interestRate() {
		System.out.println("15%");
	}
	
}
