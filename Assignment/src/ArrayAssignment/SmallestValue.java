package ArrayAssignment;

import java.util.Scanner;

public class SmallestValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		for (int i = 0; i<10; i++) {
			System.out.println("Enter number:");
			array[i] = sc.nextInt();
		}
		int sortedArray[] = smallestToLargestNumber(array);
		System.out.println("After Sorting");
		for (int x : sortedArray) {
			System.out.println(x);
		}
		System.out.println("Smallest number = "+sortedArray[0]);
		sc.close();
	}
	
	static int[] smallestToLargestNumber(int array[]) {
		int dummy = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					dummy = array[i];
					array[i] = array[j];
					array[j] = dummy;
				}
			}
		}
		return array;
	}
}
