package Constructor;

import java.util.Scanner;

/*
 * Print the sum, difference and product of two complex numbers by creating a class 
 * named 'Complex' with separate methods for each operation whose real and imaginary 
 * parts are entered by user.
 */

public class Complex {
	
	float a;
	float b;
	float c;
	float d;
	
	Complex(){
		a = 0;
		b = 0;
		c = 0;
		d = 0;
	}
	
	Complex(float a, float b, float c, float d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	void add() {
		float sumre = a+c;
		float sumimg = b+d;
		System.out.println("The sum is "+sumre+"+i"+sumimg);
	}
	
	void diff() {
		float diffre;
		float diffimg;
		if(a<c) {
			diffre = c-a;
		} else {
			diffre = a-c;
		}
		if(b<d) {
			diffimg = d-b;
		} else {
			diffimg = b-d;
		}
		System.out.println("The diffrence is "+diffre+"+i"+diffimg);
	}
	
	void mul() {
		float mulre;
		float mulimg;
		mulre = a*c-b*d;
		mulimg = a*d-b*c;
		System.out.println("The product is "+mulre+"+i"+mulimg);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter real part of 1st complex number: ");
		float a = sc.nextFloat();
		System.out.println("Enter imaginary part of 1st complex number: ");
		float b = sc.nextFloat();
		System.out.println("Enter real part of 2nd complex number: ");
		float c = sc.nextFloat();
		System.out.println("Enter imaginary part of 2nd complex number: ");
		float d = sc.nextFloat();
		Complex cp = new Complex(a, b, c, d);
		cp.add();
		cp.diff();
		cp.mul();
		sc.close();
	}
}
