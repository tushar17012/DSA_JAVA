package Array;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 4, 50, 60 };
		// Print Original Array
		System.out.println("Original Array: " + Arrays.toString(arr));
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		// Print Reversed Array
		System.out.println("Reversed Array: " + Arrays.toString(arr));
	}

}
