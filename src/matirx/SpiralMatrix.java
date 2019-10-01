package matirx;

/**
 * @author Bishwajit.
 *
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("--------ORIGINAL MATRIX--------");
		displayMatrix(matrix);

		System.out.println("--------SPIRAL MATRIX--------");
		spiralMatrix(matrix);
	}

	private static void spiralMatrix(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int k = 0;
		int l = 0, i;
		int array[] = new int[m * n];
		int a = 0;
		while (k < m && l < n) {

			// Print the first row from the remaining rows.
			for (i = l; i < n; ++i) {
//				System.out.print(matrix[k][i] + " ");
				array[a++] = matrix[k][i];
			}
			k++;

			// Print the last column from the remaining columns.
			for (i = k; i < m; ++i) {
//				System.out.print(matrix[i][n - 1] + " ");
				array[a++] = matrix[i][n - 1];
			}
			n--;

			// Print the last row from the remaining rows.
			if (k < m) {
				for (i = n - 1; i >= l; --i) {
//					System.out.print(matrix[m - 1][i] + " ");
					array[a++] = matrix[m - 1][i];
				}
				m--;
			}

			// Print the first column from the remaining columns.
			if (l < n) {
				for (i = m - 1; i >= k; --i) {
//					System.out.print(matrix[i][l] + " ");
					array[a++] = matrix[i][l];
				}
				l++;
			}
		}
		System.out.print("Matrix in Array Mode :: ");
		for (int arr : array) {
			System.out.print(arr + " ");
		}
		System.out.println();
		System.out.println("Spiral Array in Matrix Mode");
		displayMatrix(arrayToMatrix(array, matrix.length, matrix[0].length));
	}

	private static void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] arrayToMatrix(int[] array, int row, int column) {
		int new_matrix[][] = new int[row][column];
		int counter = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				new_matrix[i][j] = array[counter++];
			}
		}
		return new_matrix;
	}

}
