package OOPAssignment;

import java.util.Scanner;

/*
 * Assign and print the roll number, phone number and address of two students having 
 * names "Sam" and "John" respectively by creating two objects of class 'Student'.
 */

public class Student {
	
	String name;
	String address;
	int roll_no;
	long ph_no;
	
	void assign() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the following data");
		System.out.print("Name: "); name = sc.next();
		System.out.print("Roll Number: "); roll_no = sc.nextInt();
		System.out.print("Phone Number: "); ph_no = sc.nextInt();
		System.out.print("Address "); address = sc.next();
	}
	
	void display() {
		System.out.println("The data entered are:-");
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+roll_no);
		System.out.println("Phone Number: "+ph_no);
		System.out.println("Address "+address);
	}
	
	public static void main(String[] args) {
		Student Stu1 = new Student();
		Student Stu2 = new Student();
		Stu1.assign();
		Stu2.assign();
		Stu1.display();
		Stu2.display();
	}
}
