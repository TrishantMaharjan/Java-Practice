package MethodAssignment;

import java.util.Scanner;

public class AreaVolume{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h;
		System.out.println("Enter Height: ");
		h = sc.nextInt();
		getVolume(getArea(),h);
		sc.close();
	}
	
	static int getArea(){
		Scanner sc = new Scanner(System.in);
		int l, b;
		System.out.println("Enter Length: ");
		l = sc.nextInt();
		System.out.println("Enter Breadth: ");
		b = sc.nextInt();
		sc.close();
		return l*b;
	}
	
	static void getVolume(int area, int h){
		int volume = area*h;
		System.out.println("The area is "+area);
		System.out.println("The volume is "+volume);
	}
}
