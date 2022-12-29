package Constructor;

/*
 * Write a program to print the area of two rectangles having sides (4,5) and (5,8) 
 * respectively by creating a class named 'Rectangle' with a method named 'Area' 
 * which returns the area and length and breadth passed as parameters to its 
 * constructor.
 */

public class Rectangle {

	float l;
	float b;
	float a;
	
	Rectangle(){
		l = 0;
		b = 0;
		a = 0;
	}
	
	Rectangle(float l, float b){
		this.l = l;
		this.b = b;
		a = l*b;
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);
		System.out.println("Area 1 is "+r1.a);
		System.out.println("Area 2 is "+r2.a);
	}
}
