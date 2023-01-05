package ObjectWithMethod;

import java.util.Scanner;

public class Test {

	void print(Student s) {
		System.out.println("Id = "+s.getId());
		System.out.println("First name = "+s.getFname());
		System.out.println("Last name = "+s.getLname());
		System.out.println("College = "+s.getCollege());
		System.out.println("Age = "+s.getAge());
	}
	
	// Object as argument
	
	public static void main(String[] args) {
		/*
		Student std = new Student();
		
		std.setId(1234);
		std.setFname("Ram");
		std.setLname("Lama");
		std.setCollege("IOE Pulchowk");
		std.setAge(23);
		*/
		
		Test dummy = new Test();
		Student[] std = dummy.getStudentData();
		for(int i = 0; i<5; i++) {
			dummy.print(std[i]);
		}
		
	}
	
	// Object as return type
	
	Student[] getStudentData() {
		Student[] std = new Student[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<5; i++) {
			Student dummy = new Student();
			System.out.print("Enter ID: "); dummy.setId(sc.nextInt());
			System.out.print("Enter First Name: "); dummy.setFname(sc.next());
			System.out.print("Enter Last Name: "); dummy.setLname(sc.next());
			System.out.print("Enter College: "); dummy.setCollege(sc.next());
			System.out.print("Enter Age: "); dummy.setAge(sc.nextInt());
			std[i] = dummy;
		}
		sc.close();
		return std;
	}
}
