package ControlStatements;

public class EnhancedForTest {
	/*
	 * Syntax:
	 * for(data_type variable : collection) {
	 * 		//statements
	 * }
	 */
	public static void main(String[] args) {
		int data[] = {23,67,9,69,6064,25,2,834,8,149,13,28,4}, sum = 0;
		for(int x : data) {
			System.out.println(x);
			sum = sum + x;
		}
		System.out.println("Total sum is "+sum);
	}
}
