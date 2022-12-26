package ControlStatements;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		/*
		 * syntax:
		 * do {
		 * 	//statements
		 * 	//inc/dec
		 * } while(condition);
		 */
		int i = 1, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		num = sc.nextInt();
		do {
			System.out.println(num+" x "+i+" = "+(num*i));
			i++;
		} while (i <= 10);
		sc.close();
	}
}
