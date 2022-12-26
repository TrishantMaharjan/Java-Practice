import java.util.Scanner;

/*
 * WAP to calculate total salary for ff post:
 * Post		Basic Salary		Bonus		Total Salary
 * MD		400000				29.89%
 * CEO		538000				15%
 * Manager	280000				5.78%
 * Helper	120000				7.98%
 */

public class SalaryPost {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String post;
		float salary = 0, bonus = 0, totalSalary = 0;
		System.out.println("Enter yout Post ");
		post = sc.next();
		switch (post) {
		case "MD":
			salary = 400000f;
			bonus = 29.89f;
			totalSalary = salary+salary*bonus/100;
			break;
		case "CEO":
			salary = 530000f;
			bonus = 15f;
			totalSalary = salary+salary*bonus/100;
			break;
		case "Manager":
			salary = 280000f;
			bonus = 5.78f;
			totalSalary = salary+salary*bonus/100;
			break;
		case "Helper":
			salary = 120000f;
			bonus = 7.98f;
			totalSalary = salary+salary*bonus/100;
			break;
		default:
			System.out.println("Invalid entry");
		}
		System.out.println("Total Salary is "+totalSalary);
		sc.close();
	}
}
