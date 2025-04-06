package Array;

public class Occurence_elemt {
	public static int Occurence_Ele(int []arr,int tar) {
		int count = 0;
		for(int num : arr) {
			if(num == tar) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {90,80,10,20,80,75};
		int target = 80;
		int result  = Occurence_Ele(arr,target);
		System.out.println("Result: "+ result);
	}

}
