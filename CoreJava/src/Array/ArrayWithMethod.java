package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithMethod {
	/*
	 * ========== Array With Method ==========
	 * 1) Array as argument:
	 * 		void sum(float a[]){
	 * 			//statements
	 * 		}
	 * 		sum(array);
	 * 
	 * 2) Array as return type:
	 * 		int[] getData(){
	 * 			//array = *elements*;
	 * 			return array;
	 * 		}
	 */
	public static void main(String[] args) {
		//1)
		//int data[] = new int[10];
		String country[] = new String[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			//System.out.println("Enter integer "+i);
			//data[i] = sc.nextInt();
			System.out.println("Entry country's name "+i);
			country[i] = sc.next();
		}
		//printArray(data);
		//sum(data);
		printCountry(country);
		sc.close();
		
		//2
		int array[] = getOddNumbersFrom1to100();
		System.out.println(Arrays.toString(array));
		float arraySP[] = getSumAndPercentOfOddNumbers(array); //To display all elements of an array
		System.out.println(Arrays.toString(arraySP));
	}
	
	// 1) Array as arguments:
	static void sum(int values[]) {
		int sum = 0;
		for (int x : values) {
			sum = sum + x;
		}
		System.out.println("Total = "+sum);
	}
	
	static void printArray(int displayArray[]) {
		for(int x : displayArray) {
			System.out.println(x);
		}
	}
	
	static void printCountry(String displayArray[]) {
		for(String x : displayArray) {
			System.out.println(x);
		}
	}
	
	// 2) Array as return type:
	static int[] getOddNumbersFrom1to100() {
		int oddNums[] = new int[50], index = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2 != 0) {
				oddNums[index] = i;
				index++;
			}
		}
		return oddNums;
	}
	
	// Combination of 1 and 2:
	static float[] getSumAndPercentOfOddNumbers(int oddArray[]) {
		float example[] = new float[2];
		for(int x : oddArray) {
			example[0] = example[0] + x;
		}
		example[1] = example[0]/oddArray.length;
		return example;
	}
}
