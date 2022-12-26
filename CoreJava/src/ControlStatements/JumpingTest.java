package ControlStatements;

public class JumpingTest {
	public static void main(String[] args) {
		/*
		 * =========== Jumping Statements ==========
		 * 1) break; : exit from loop
		 * 2) continue; : skip values
		 * 3) return; : exit from method
		 */
		for(int i = 1; i <= 10; i++) {
			if(i == 5 || i == 8) {
				//break;
				//continue;
				return;
			}
			System.out.println(i);
		}
		System.out.println("End for loop");
	}
}
