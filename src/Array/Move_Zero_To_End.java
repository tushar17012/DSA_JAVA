package Array;

import java.util.Arrays;

public class Move_Zero_To_End {
	/**
	 * @param arr
	 */
	public static void Move_Zero(int[] arr) {
		if (arr == null || arr.length == 0) {
			System.out.println("No element in the Array: " + Arrays.toString(arr));
			return;
		}
		int index = 0; // Points to the next non-zero position

		// Move non-zero elements to the front
		for (int num : arr) {
			if (num != 0) {
				arr[index++] = num;
			}
		}

		// Fill remaining positions with zeros
		while (index < arr.length) {
			arr[index++] = 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 20, 0, 40, 50, 75 };
		System.out.println("Array Before : " + Arrays.toString(arr));
		Move_Zero(arr);
		System.out.println("Array After : " + Arrays.toString(arr));
	}

}
