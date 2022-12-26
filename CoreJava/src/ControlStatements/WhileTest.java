package ControlStatements;

import java.util.Scanner;

public class WhileTest {
	/*
	 * syntax:
	 * while(condition) {
	 * 		//statements
	 * 		//inc/dec
	 * }
	 */
	public static void main(String[] args) {
		int i, factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		i = sc.nextInt();
		while(i != 1) {
			factorial = factorial * i;
			i--;
		}
		System.out.println("The factorial is "+factorial);
		sc.close();
	}
}
