package ArrayAssignment;

import java.util.Scanner;

public class OddNumbers {
	public static void main(String[] args) {
		int dummy[] = oddSort(getArray());
		displayArray(dummy);
	}
	
	static int[] oddSort(int array[]) {
		int oddArray[] = new int[array.length];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2 != 0) {
				oddArray[index] = array[i];
				index++;
			}
		}
		return oddArray;
	}
	
	static int[] getArray() {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter number:");
			array[i] = sc.nextInt();
		}
		sc.close();
		return array;
	}
	
	static void displayArray(int array[]) {
		System.out.println("The odd integers are: ");
		for (int x : array) {
			System.out.println(x);
		}
	}
}
