package edu.umsl.arrays;

public class ThreeDimensionalArray {
	
	//4 columns with 3 rows each, 2 deep
	public static void main(String args[]) {
		int numbers[][][] = new int[2][3][4];
		int i, j, k, num = 1;
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				for (k = 0; k < 4; k++) {
					numbers[i][j][k] = num;
					num++;
				}
			}
		}
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				for (k = 0; k < 4; k++) {
					// "/t" inserts a tab
					System.out.print("numbers[" + i + "][" + j + "][" + k + "] = " + numbers[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
