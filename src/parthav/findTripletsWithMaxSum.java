/*Assignment - 32 : 10th Sep'2021

Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum*/

package parthav;

public class findTripletsWithMaxSum {

	int currentTripletsSum = 0;
	int maxTripletsSum = 0;
	int tripletNumber = 0;

	void findTripletsWithMaxSum(int[] inputArr) {
		for (int index = 0; index < inputArr.length - 2; index++) {
			if ((inputArr[index] + 1 == inputArr[index + 1]) && (inputArr[index] + 2 == inputArr[index + 2])) {
				currentTripletsSum = getSumOfTriplets(inputArr[index]);
			}

			if (maxTripletsSum < currentTripletsSum) {
				maxTripletsSum = currentTripletsSum;
				tripletNumber = inputArr[index];
			}

		}

		System.out.println("The triplet with the maximum sum is: " + tripletNumber + " " + (tripletNumber + 1) + " "
				+ (tripletNumber + 2));
		System.out.println("The sum of this triplet is: " + maxTripletsSum);

	}

	int getSumOfTriplets(int index) {
		return ((index * 3) + 3);
	}

	public static void main(String[] args) {
		findTripletsWithMaxSum newObject = new findTripletsWithMaxSum();
		int[] inputArr = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };
		newObject.findTripletsWithMaxSum(inputArr);

	}

}
