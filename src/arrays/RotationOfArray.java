package arrays;

/**
 * @author Bishwajit.
 *
 */
public class RotationOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// original Array
		display(ar);

		// Array left rotation by 2.
		ar = rotateArray(ar, 5);
		display(ar);
	}

	private static int[] rotateArray(int[] ar, int n) {
		int temp[] = new int[ar.length];
		int counter = n;
		int i = 0;
		while (n < ar.length) {
			temp[i++] = ar[n++];
		}

		for (int j = 0; j < counter; j++) {
			temp[i++] = ar[j];
		}
		return temp;
	}

	private static void display(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}

}
