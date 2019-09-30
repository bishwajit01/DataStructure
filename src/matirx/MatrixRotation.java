package matirx;

/**
 * @author Bishwajit.
 *
 */
public class MatrixRotation {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("--------ORIGINAL MATRIX--------");
		display(matrix);
		System.out.println("--------MATRIX ROTATION--------");
		rotateMatrix(matrix);
	}

	private static void rotateMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void display(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
