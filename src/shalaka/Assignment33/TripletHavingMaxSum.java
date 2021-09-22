/*Assignment - 32 : 10th Sep'2021

Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum*/
package shalaka.Assignment33;

public class TripletHavingMaxSum {
	void getTripletHavingMaxSum(int[] arr) {
		int sum = 0;
		int maxSum = 0;
		int maxIndex = 0;
		for (int index = 0; index < arr.length - 2; index++) {
			if ((arr[index] + 2 == arr[index + 1] + 1) && (arr[index] + 2 == arr[index + 2])) {
				sum = arr[index] + arr[index + 1] + arr[index + 2];
				if (sum > maxSum) {
					maxSum = sum;
					maxIndex = index;
				}
			}
		}
		System.out.println(arr[maxIndex] + " " + arr[maxIndex + 1] + " " + arr[maxIndex + 2] + " "
				+ " is a triplet having maximum sum: " + maxSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };
		TripletHavingMaxSum tripletHavingMaxSum = new TripletHavingMaxSum();
		tripletHavingMaxSum.getTripletHavingMaxSum(arr);
	}
}