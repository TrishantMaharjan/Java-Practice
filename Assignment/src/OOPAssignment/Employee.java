package OOPAssignment;

import java.util.Scanner;

/*
 * Write a program that would print the information (name, year of joining, salary, address) 
 * of three employees by creating a class named 'Employee'. The output should be as follows:
 * Name		Year of joining		Address
   Robert 	1994 				64C- WallsStreat
   Sam 		2000 				68D- WallsStreat
   John 	1999 				26B- WallsStreat
 */

public class Employee {
	
	String name;
	String address;
	int year;
	
	void dataEntry() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the following data:- ");
		System.out.print("Name: "); name = sc.next();
		System.out.print("Year of joining: "); year = sc.nextInt();
		System.out.print("Address: "); address = sc.next();
	}
	
	void display() {
		System.out.println(name+"\t"+year+"\t\t"+address);
	}
	
	public static void main(String[] args) {
		Employee E1 = new Employee();
		Employee E2 = new Employee();
		Employee E3 = new Employee();
		E1.dataEntry();
		E2.dataEntry();
		E3.dataEntry();
		System.out.println("Name Year of joining Address");
		E1.display();
		E2.display();
		E3.display();
	}
}
