package monali.Assignment_33;

/*program 4 : find the triple which in sequence and having maximum sum

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12*/

public class MaximumSumTripleSequence {

	void maxSumTriplet(int[] input) {
		int maxSum = 0;
		int num1 = 0, num2 = 0, num3 = 0;
		int sum = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] == (input[index + 1] - 1) && input[index] == (input[index + 2] - 2)) {
				sum = input[index] + input[index + 1] + input[index + 2];

				if (maxSum < sum) {
					maxSum = sum;
					num1 = input[index];
					num2 = input[index + 1];
					num3 = input[index + 2];
				}

			}
		}
		System.out.println("consecutive numbers in array : " + num1 + " " + num2 + " " + num3);
		System.out.println("Maximum consecutive numbers sum is :" + maxSum);
	}

	public static void main(String[] args) {
		MaximumSumTripleSequence triplet = new MaximumSumTripleSequence();
		int input[] = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 12, 44, 67, 1, 2, 3, 99 };
		triplet.maxSumTriplet(input);
	}
}
