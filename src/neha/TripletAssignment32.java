package neha;
/*Program 1: find the triplet which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum*/

public class TripletAssignment32 {
	void displayTripletWithMaxSum(int[] arr) {
		int maxSum = 0;
		int sum = 0;
		int maxStartIndex = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i + 1] == arr[i] + 1 && arr[i + 2] == arr[i] + 2) {
				sum = arr[i] + arr[i + 1] + arr[i + 2];
				if (maxSum < sum) {
					maxSum = sum;
					maxStartIndex = i;
				}
			}
		}
		System.out.println("Triplet with maximum sum is [" + arr[maxStartIndex] + "," + arr[maxStartIndex + 1] + ","
				+ arr[maxStartIndex + 2] + "] and sum is " + maxSum);

	}

	public static void main(String[] args) {
		TripletAssignment32 tripletAssignment32 = new TripletAssignment32();
		int[] arr = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };
		tripletAssignment32.displayTripletWithMaxSum(arr);
	}
}
