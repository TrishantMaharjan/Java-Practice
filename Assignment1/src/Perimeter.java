import java.util.Scanner;

public class Perimeter {
	public static void main(String[] args) {
		int choice;
		float perimeter=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Perimeter of circle ");
		System.out.println("2. Perimeter of triangle ");
		System.out.println("3. Perimeter of rectangle ");
		choice = sc.nextInt();
		if (choice == 1) {
			float r, pi = 22/7f;
			System.out.println("Enter Radius ");
			r = sc.nextFloat();
			perimeter = (2*pi*r);
		}
		if (choice == 2) {
			float l1, l2, l3;
			System.out.println("Enter Length 1 ");
			l1 = sc.nextFloat();
			System.out.println("Enter Length 2 ");
			l2 = sc.nextFloat();
			System.out.println("Enter Length 3 ");
			l3 = sc.nextFloat();
			perimeter = l1 + l2 + l3;
		}
		if (choice == 3) {
			float l, b;
			System.out.println("Enter Length ");
			l = sc.nextFloat();
			System.out.println("Enter Breadth ");
			b = sc.nextFloat();
			perimeter = l + b;
		}
		System.out.println("Perimeter = "+perimeter);
		sc.close();
	}
}
