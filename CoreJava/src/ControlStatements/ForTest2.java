package ControlStatements;

public class ForTest2 {
	public static void main(String[] args) {
		int esum = 0, osum = 0;
		for (int i=1; i<= 100; i++) {
			if (i % 2 == 0) {
				esum = esum + i;
			} else {
				osum = osum + i;
			}
		}
		System.out.println("Sum of even numbers is "+esum+" \nSum of odd numbers is "+osum);
	}
}