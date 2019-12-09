package matrix;

import java.util.Arrays;

/**
 * @author Bishwajit.
 * 
 *         Minimum and Maximum Sum of Length-1. Suppose there is a matrix of
 *         length 20. Maximum Sum of 19 Elements. Minimum Sum of 19 Elements
 *
 */
public class MaxMinSum {

	public static void main(String[] args) {
		int arr[] = { 3, 6, 8, 3, 6, 1, 2, 3 };

		System.out.print("Arrays :: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Maximum and Minimum Sum
		System.out.println();
		minMaxSum(arr);
	}

	static void minMaxSum(int[] arr) {
		int maxSum = 0;
		int minSum = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1)
				minSum += arr[i];
			if (i > 0)
				maxSum += arr[i];
		}

		System.out.println("Max Sum :: " + maxSum);
		System.out.println("Min Sum :: " + minSum);
	}
}
