/**
 * 
 */
package arrays;

/**
 * @author Bishwajit.
 *
 */
public class MultiDimensionArray {

	public MultiDimensionArray() {
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][][] a = new int[2][3][4];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 4; k++) {
					a[i][j][k] = k;
				}
			}
		}
		
		int c[][][] = { { { 0, 1, 2, 3 }, { 0, 1, 2, 3 }, { 0, 1, 2, 3 } },
						{ { 0, 1, 2, 3 }, { 0, 1, 2, 3 }, { 0, 1, 2, 3 } } };
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 4; k++) {
					System.out.print(a[i][j][k] + " " + c[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
