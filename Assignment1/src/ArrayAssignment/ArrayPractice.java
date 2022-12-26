package ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public static void main(String[] args) {
		int array[] = getArray();
		displayArray(array);
	}
	
	static int[] getArray() {
		Scanner sc = new Scanner(System.in);
		int elements[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter number: ");
			elements[i] = sc.nextInt();
		}
		sc.close();
		return elements;
	}
	
	static void displayArray(int dummy[]) {
		System.out.println(Arrays.toString(dummy));
	}
}
