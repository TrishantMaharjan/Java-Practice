package ObjectWithArrayPractice;

import java.util.Scanner;

public class Mobile {
	public static void main(String[] args) {
		MobilePojo[] mbl = getArray();
		showArray(mbl);
	}
	
	static MobilePojo[] getArray() {
		MobilePojo[] m = new MobilePojo[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<3; i++) {
			MobilePojo dummy = new MobilePojo();
			System.out.print("Enter Serial Number: "); dummy.setSn(sc.nextInt());
			System.out.print("Enter Company: "); dummy.setCompany(sc.next());
			System.out.print("Enter Model: "); dummy.setModel(sc.next());
			System.out.print("Enter Price: "); dummy.setPrice(sc.nextInt());
			m[i] = dummy;
		}
		sc.close();
		return m;
	}
	
	static void showArray(MobilePojo[] mble) {
		for(int i = 0; i<3; i++) {
			System.out.println("Serial Number: "+mble[i].getSn()); 
			System.out.println("Company: "+mble[i].getCompany());
			System.out.println("Model: "+mble[i].getModel());
			System.out.println("Price: "+mble[i].getPrice());
		}
	}
}
