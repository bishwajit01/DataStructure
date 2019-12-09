package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Bishwajit.
 *
 */
public class MatrixDiagonalSumAndDifference {

	public static void main(String[] args) {

		List list = new ArrayList<ArrayList<Integer>>();

		list.add(new ArrayList(Arrays.asList(1, 4, 8)));
		list.add(new ArrayList(Arrays.asList(6, 1, 5)));
		list.add(new ArrayList(Arrays.asList(11, 2, 7)));

		// Displaying the Matrix.
		displayMatrix(list);

		// Sum of diagonals.
		diagonalSum(list);

		// Difference of diagonals.
		diagonalDiff(list);
	}

	private static void diagonalSum(List<List<Integer>> matrix) {
		int left = 0, right = 0;
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.get(i).size(); j++) {
				if (i == j) {
					left += matrix.get(i).get(j);
				}
				if (i == matrix.size() - 1 - j) {
					right += matrix.get(i).get(j);
				}
			}
		}
		System.out.println("Sum Of Matrix Diagonal : " + (left + right));
	}

	private static void diagonalDiff(List<List<Integer>> matrix) {
		int left = 0, right = 0;
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.get(i).size(); j++) {
				if (i == j)
					left += matrix.get(i).get(j);
				if (i == matrix.size() - 1 - j)
					right += matrix.get(i).get(j);
			}
		}
		System.out.println("Difference Of Matrix Diagonal : " + Math.abs(left - right));
	}

	private static void displayMatrix(List<List<Integer>> matrix) {
		System.out.println("Matrix ELements :: ");
		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.get(i).size(); j++) {
				System.out.print(matrix.get(i).get(j) + "  ");
			}
			System.out.println();
		}
	}
}
