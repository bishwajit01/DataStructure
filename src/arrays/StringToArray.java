/**
 * 
 */
package arrays;

/**
 * @author Bishwajit.
 *
 */
public class StringToArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String string = "abcdef";

		// Splitting array
		String[] array = string.split("");

		// Iterating over the Arrays.
		for (String s : array) {
			System.out.print(s + " ");
		}
	}

}
