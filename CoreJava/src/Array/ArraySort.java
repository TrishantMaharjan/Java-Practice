package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data[] = new int[10];
		for(int i = 0; i < data.length; i++) {
			System.out.print("Enter element "+i+": ");
			data[i] = sc.nextInt();
		}
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		for(int i = data.length-1; i >= 0; i--) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		Arrays.fill(data, 50); // Fills 50 in array, all slots.
		System.out.println(Arrays.toString(data));
		Arrays.fill(data, 3, 8, 77); // Fills 77 from index 3 to 7.
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(Arrays.copyOf(data, 3)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(data, 2, 7)));
		sc.close();
	}
}
