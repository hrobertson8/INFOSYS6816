package edu.umsl.arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] integers = new int[2][3];
		int k = 0;
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 2; j++) {
				integers[i][j] = k;
				k++;

			}
		}
		System.out.println("Rows: " + integers.length);
		System.out.println("Columns: " + integers[0].length);
	}
}
