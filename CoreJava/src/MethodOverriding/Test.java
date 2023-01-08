package MethodOverriding;

public class Test {
	
	public static void main(String[] args) {
		// static or early binding of object
		NMBBank nmb = new NMBBank();
		nmb.bankName();
		nmb.interestRate();
		
		SCBank sc = new SCBank();
		
		// up-casting
		// leads to dynamic binding
		CentralBank nic = new NICBank();
		printBank(nic);
		
		// no error as method parameter is parent class object
		printBank(sc);
	}
	
	// dynamic or late binding of Object
	// also called run time polymorphism
	static void printBank(CentralBank cb) {
		cb.bankName();
		cb.interestRate();
	}
	
}
