package Array;

public class Check_Array_Sorted {
	public static boolean checkArrSort(int[] arr) {
		if (arr == null || arr.length <= 1) {
            return true; // Empty or single-element array is always sorted
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) { // If previous element is greater, it's not sorted
                return false;
            }
        }
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		Boolean result = checkArrSort(arr);
		System.out.println("Result:" + result);

	}

}
