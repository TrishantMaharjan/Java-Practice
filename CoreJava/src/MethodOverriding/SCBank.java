package MethodOverriding;

public class SCBank extends CentralBank{

	@Override
	protected void bankName() {
		System.out.println("Standard Charter Bank");
	}
	
	@Override
	protected void interestRate() {
		System.out.println("18%");
	}
	
}
