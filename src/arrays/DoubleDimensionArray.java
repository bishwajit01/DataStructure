/**
 * 
 */
package arrays;

/**
 * @author Bishwajit.
 *
 */
public class DoubleDimensionArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] a = new int[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = j;
			}
		}
		
		int b[][] = a;
		int c[][] = { { 0, 1, 2, 3 }, { 0, 1, 2, 3 }, { 0, 1, 2, 3 } };
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j] + " " + b[i][j] + " " + c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
