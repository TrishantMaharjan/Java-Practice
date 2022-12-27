package MethodAssignment;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		float si = entry();
		System.out.println("The simple interest is "+si);
	}
	
	static float entry(){
		Scanner sc = new Scanner(System.in);
		float p, t, r, si = 0;
		System.out.println("Enter principle: ");
		p = sc.nextFloat();
		System.out.println("Enter time: ");
		t = sc.nextFloat();
		System.out.println("Enter rate");
		r = sc.nextFloat();
		si = calculation(p, t, r);
		sc.close();
		return si;
	}
	
	static float calculation(float p, float t, float r){
		return p*t*r/100;
	}
}