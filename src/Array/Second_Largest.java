package Array;

public class Second_Largest {
	public static int findSecondLargest(int[] arr) {
		if (arr.length < 2) {
			System.out.println("Array must have at least two elements.");
			return Integer.MIN_VALUE; // No second largest element possible
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num < largest) {
				secondLargest = num;
			}
		}

		return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest; // If no second largest, return -1
	}

	public static void main(String[] args) {
		int[] arr = { -10, -40, -25, -12, -25, -10 }; // Corrected input format
		int result = findSecondLargest(arr);
		System.out.println("Second Largest Element: " + result);
	}
}
