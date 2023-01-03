package com.example.domain;

import InheritanceEncapsulationPractice.Manager;

public class Director extends Manager {
	
	private double budget;
	
	Director(int empId, String name, String ssn, double salary, String deptName, double budget) {
		super(empId, name, ssn, salary, deptName);
	}

	public double getBudget() {
		return budget;
	}
}
