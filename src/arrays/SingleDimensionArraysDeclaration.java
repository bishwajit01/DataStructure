/**
 * 
 */
package arrays;

/**
 * @author Bishwajit.
 *
 */
public class SingleDimensionArraysDeclaration {

	/**
	 * @param args
	 */
    public static void main(String[] srgs) {
        int a[] = new int[5];
        int[] b = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            b[i] = (i + 1) * (i + 1);
        }
        //Initializing with the array index
        int[] c = { a[0] + 1 , 8 , 27 , 64 , (int) Math.pow(a[4] , 3) };
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " \t " + b[i] + " \t " + c[i]);
        }
        
        int n = 5;
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = i;
        }
        
        for (int e : d)
            System.out.print(e + " ");
    }
}
