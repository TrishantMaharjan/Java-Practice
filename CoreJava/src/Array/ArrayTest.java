package Array;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int age[] = new int[5];
		Scanner sc = new Scanner(System.in);
//		age[0] = 20;
//		age[1] = 22;
//		age[2] = 21;
//		age[3] = 20;
//		age[4] = 23;
		for (int i = 0; i < age.length; i++) {
			System.out.println("Enter age:");
			age[i] = sc.nextInt();
		}
//		for(int i = 0; i<=4; i++) {
//			System.out.println(age[i]);
//		}
		for(int x : age) {
			System.out.println(x);
		}
		sc.close();
	}
}
