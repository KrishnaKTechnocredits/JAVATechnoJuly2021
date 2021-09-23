package varun.varun_string_assignment;

public class TripletInSequenceMaxSum {
	int sum;
	int maxSum;

	void tripletAndItsSum(int[] arr) {
		for (int index = 0; index < arr.length - 2; index++) {
			if (arr[index] + 1 == arr[index + 1] && arr[index] + 2 == arr[index + 2]) {
				sum += (arr[index] + arr[index + 1] + arr[index + 2]);
			}
			if (maxSum < sum) {
				maxSum = sum;
				sum = 0;
			}
			
		}
		System.out.println("Max Sum from triplet is " +maxSum);
	}

	public static void main(String[] args) {
		int[] input = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 12, 44, 67, 1, 2, 3, 99 };
		TripletInSequenceMaxSum triple = new TripletInSequenceMaxSum();
		triple.tripletAndItsSum(input);
	}
}
