package Array;

import java.util.Scanner;

public class MultiDArray {
	/*
	 * ========== Multi Dimentional Array ==========
	 * syntax:
	 * 	data_type array_name[][] = new data_type[row][column];
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matrix[][] = new int [2][2];
		/*
		 * 	  C0 C1
		 * R0 [] []
		 * R1 [] []
		 */
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print("Enter element "+(i+1)+(j+1)+": ");
				matrix[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
