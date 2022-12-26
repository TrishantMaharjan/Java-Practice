package ControlStatements;

import java.util.Scanner;

public class LadderTest {
	/*
	 *  ============ else if ==========
	 *  syntax:
	 *  if(condition 1) {
	 *  	
	 *  } else if(condition 2) {
	 *  	
	 *  } else if(condition 3) {
	 *  
	 *  } else {
	 *  
	 *  }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks;
		System.out.println("Enter your marks: ");
		marks = sc.nextInt();
		if(marks >= 80) {
			System.out.println("Distinction");
		} 
		else if(marks >= 60) {
			System.out.println("First Division");
		}
		else if(marks >= 45) {
			System.out.println("Second Division");
		}
		else if(marks >= 32) {
			System.out.println("Third Division");
		}
		else {
			System.out.println("Failed");
		}
		sc.close();
	}
}
