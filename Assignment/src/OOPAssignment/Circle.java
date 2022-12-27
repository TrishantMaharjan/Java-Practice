package OOPAssignment;

import java.util.Scanner;

public class Circle {
	float radius, pi = 3.1415f;
	
	void area() {
		float area;
		area = radius*radius*pi;
		System.out.println("The area is "+area);
	}
	
	void perimeter() {
		float perimeter;
		perimeter = 2*pi*radius;
		System.out.println("The perimeter is "+perimeter);
	}
	
	public static void main(String[] args) {
		Circle cr = new Circle();
		cr = dataEntry();
		cr.area();
		cr.perimeter();
	}
	
	static Circle dataEntry() {
		Scanner sc = new Scanner(System.in);
		Circle data = new Circle();
		System.out.println("Enter radius of circle: ");
		data.radius = sc.nextFloat();
		sc.close();
		return data;
	}
}
