package Constructor;

import java.util.Scanner;

/*
 * Write a program to print the area of a rectangle by creating a class named 'Area' 
 * taking the values of its length and breadth as parameters of its constructor and 
 * having a method named 'returnArea' which returns the area of the rectangle. Length 
 * and breadth of rectangle are entered through keyboard.
 */

public class Area {
	
	float l;
	float b;
	
	Area(){
		l = 0;
		b = 0;
	}
	
	Area(float l, float b){
		this.l = l;
		this.b = b;
	}
	
	float returnArea(){
		float area;
		area = l*b;
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		float l = sc.nextFloat();
		System.out.println("Enter breadth: ");
		float b = sc.nextFloat();
		Area r = new Area(l, b);
		System.out.println("The area is "+r.returnArea());
		sc.close();
	}
}
