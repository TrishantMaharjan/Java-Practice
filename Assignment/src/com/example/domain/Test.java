package com.example.domain;

import java.util.Scanner;

import InheritanceEncapsulationPractice.Manager;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		int empId = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter SSN");
		String ssn = sc.next();
		System.out.println("Enter Salary");
		double salary = sc.nextDouble();
		Engineer er = new Engineer(empId, name, ssn, salary);
		er.printEmployee();
		System.out.println("Enter Department Name");
		String deptName = sc.next();
		Manager mg = new Manager(empId, name, ssn, salary, deptName);
		mg.printEmployee();
		Admin ad = new Admin(empId, name, ssn, salary);
		ad.printEmployee();
		System.out.println("Enter Budget");
		double budget = sc.nextDouble();
		Director dir = new Director(empId, name, ssn, salary, deptName, budget);
		dir.printEmployee();
		sc.close();
	}
}
