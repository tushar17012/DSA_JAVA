package Array;

public class Sum_Array {

	public static void main(String[] args) {
		  int[] arr = { 10, 20, 30, 40, 50, 60, 70 };

	        // Using enhanced for loop for better readability
	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }

	        System.out.println("SUM : " + sum);
	}

}
