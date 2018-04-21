package simple.matrix.creation;

import java.util.Scanner;

public class CreateMaitixWithGivenValues {
	public void createMatrix() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int rowCount = in.nextInt();
		System.out.println("Enter the no of columns");
		int columnCount = in.nextInt();
		System.out.println("Enter the matrix data");
		int[][] matrix = new int[rowCount][columnCount];
		// Getting the input values
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				matrix[i][j] = in.nextInt();
			}
		}

		in.close();

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}
}
