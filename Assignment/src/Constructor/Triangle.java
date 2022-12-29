package Constructor;

import java.util.Scanner;

/*
 * Write a program to print the area and perimeter of a triangle having sides of 3, 4 
 * and 5 units by creating a class named 'Triangle' without any parameter in its 
 * constructor.
 * 
 * Write a program to print the area and perimeter of a triangle having sides of 3, 4 
 * and 5 units by creating a class named 'Triangle' with constructor having the three 
 * sides as its parameters.
 */

public class Triangle {
	
	float s1;
	float s2;
	float s3;
	
	Triangle(){
		s1 = 3;
		s2 = 4;
		s3 = 5;
	}
	
	Triangle(float a, float b, float c) {
		s1 = a;
		s2 = b;
		s3 = c;
	}
	
	void area() {
		float s = (s1+s2+s3)/2;
		double dummy = s*(s-s1)*(s-s2)*(s-s3);
		double a = Math.pow(dummy, 0.5);
		System.out.println("The area is "+a);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st side: ");
		float s1 = sc.nextFloat();
		System.out.println("Enter 2nd side: ");
		float s2 = sc.nextFloat();
		System.out.println("Enter 3rd side: ");
		float s3 = sc.nextFloat();
		Triangle t = new Triangle(s1, s2, s3);
		t.area();
		sc.close();
	}
}
