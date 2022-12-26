package ControlStatements;

import java.util.Scanner;

public class CtrlStatements {
	/*
	 * ========== Control Statements ==========
	 * Used to implement conditions for logics in the program.
	 * 
	 * Types:
	 * 1. Selection (Decision Making)
	 * 	a) if
	 * 	b) if-else
	 * 	c) nested if-else
	 * 	d) if-else ladder
	 * 	e) switch
	 * 2. Looping (Iteration)
	 * 	a) for
	 * 	b) while
	 * 	c) do-while
	 * 3. Jumping (Branching)
	 * 	a) break
	 * 	b) continue
	 * 	c) return
	 */
	
	public static void main(String[] args) {
		/*
		 * Syntax for if:
		 * 	if(condition){
		 * 		//statements
		 * 	}
		 */
		
		int salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary ");
		salary = sc.nextInt();
		if (salary <= 30000) {
			salary = salary + 8000;
		}
		System.out.println("Your total salary = "+salary);
		sc.close();
	}
}
