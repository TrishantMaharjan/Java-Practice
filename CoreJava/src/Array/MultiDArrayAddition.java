package Array;

public class MultiDArrayAddition {
	public static void main(String[] args) {
		int matrix1[][] = {{40,90},{22,11}};
		int matrix2[][] = {{5,7},{9,3}};
		int matrix3[][] = new int[2][2];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				matrix3[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
