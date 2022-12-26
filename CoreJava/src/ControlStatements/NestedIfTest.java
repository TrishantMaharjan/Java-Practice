package ControlStatements;

import java.util.Scanner;

public class NestedIfTest {
	/*
	 * Syntax:
	 * if (condition 1) {
	 * 	if (condition 2) {
	 * 			:
	 * 			:
	 * 	} else {
	 * 	}
	 * } else {
	 * }
	 */
	public static void main(String[] args) {
		String citizen = "Nepali";
		int age = 40;
		boolean voterId = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Citizenship");
		citizen = sc.next();
		System.out.println("Enter Age");
		age = sc.nextInt();
		System.out.println("Enter voterId");
		voterId = sc.nextBoolean();
		if(citizen.equals("Nepali")) {
			if(age >= 18) {
				if(voterId) {
					System.out.println("You can vote");
				} else {
					System.out.println("You don't have voter ID");
				}
			} else {
				System.out.println("You are under aged");
			}
		} else {
			System.out.println("Invalid citizenship");
		}
		sc.close();
	}
}
