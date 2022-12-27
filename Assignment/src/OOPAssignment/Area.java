package OOPAssignment;

import java.util.Scanner;

/*
 * Write a program to print the area of a rectangle by creating a class named 'Area' having 
 * two methods. First method named as 'setDim' takes length and breadth of rectangle as 
 * parameters and the second method named as 'getArea' returns the area of the rectangle. 
 * Length and breadth of rectangle are entered through keyboard.
 */

public class Area {
	
	float length;
	float breadth;
	
	void setDim() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		length = sc.nextFloat();
		System.out.println("Enter Breadth");
		breadth = sc.nextFloat();
		sc.close();
	}
	
	float getArea() {
		float area = length*breadth;
		return area;
	}
	
	public static void main(String[] args) {
		Area area = new Area();
		area.setDim();
		System.out.println("Area = "+area.getArea());
	}
}
