package OOP;

import java.util.Scanner;

public class Rectangle {
	float length, breadth;
	
	Rectangle dataEntry() {
		Rectangle R = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length ");
		R.length = sc.nextFloat();
		System.out.println("Enter breadth ");
		R.breadth = sc.nextFloat();
		sc.close();
		return R;
	}
	
	float area(float l, float b) {
		float a;
		a = l*b;
		return a;
	}
	
	float perimeter(float l, float b) {
		float p;
		p = l+b;
		return p;
	}
	
	void display(float a, float p) {
		System.out.println("The area is "+a);
		System.out.println("The perimeter is "+p);
	}
	
	public static void main(String[] args) {
		float area, perimeter;
		Rectangle dummy = new Rectangle();
		Rectangle R = dummy.dataEntry();
		area = R.area(R.length, R.breadth);
		perimeter = R.perimeter(R.length, R.breadth);
		R.display(area, perimeter);
	}
}
