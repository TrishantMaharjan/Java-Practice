package OOP;

import java.util.Scanner;

public class Rectangle {
	float length, breadth;
	
	float area() {
		float a;
		a = length*breadth;
		return a;
	}
	
	float perimeter() {
		float p;
		p = 2*(length*breadth);
		return p;
	}
	
	void display(float a, float p) {
		System.out.println("The area is "+a);
		System.out.println("The perimeter is "+p);
	}
	
	public static void main(String[] args) {
		float area, perimeter;
		Rectangle R = dataEntry();
		area = R.area();
		perimeter = R.perimeter();
		R.display(area, perimeter);
	}
	
	static Rectangle dataEntry() {
		Rectangle R = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length ");
		R.length = sc.nextFloat();
		System.out.println("Enter breadth ");
		R.breadth = sc.nextFloat();
		sc.close();
		return R;
	}
}
