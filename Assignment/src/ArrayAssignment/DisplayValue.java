package ArrayAssignment;

import java.util.Scanner;

public class DisplayValue {
	/*
	 * Subject			Marks
	 * .......			.....
	 * Math				89
	 * Science			90
	 * :
	 * :
	 * :
	 * :
	 * :
	 * :
	 * Total			-
	 * Percent			-
	 */
	public static void main(String[] args) {
		String subject[] = new String[8];
		int marks[] = new int[8];
		float total = 0, percent = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < subject.length; i++) {
			System.out.println("Enter "+i+" subject");
			subject[i] = sc.next();
			System.out.println("Enter "+i+" marks");
			marks[i] = sc.nextInt();
		}
		System.out.println("Subject          Marks");
		System.out.println(".......          .....");
		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i]+"          "+marks[i]);
			total = total + marks[i];
		}
		percent = total/marks.length;
		System.out.println("Total = "+total);
		System.out.println("Percent = "+percent);
		sc.close();
	}
}
