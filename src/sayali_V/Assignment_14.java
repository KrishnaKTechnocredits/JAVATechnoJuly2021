/*	Find maximuum number from given array. int[] input={1,11,44,23,55,99,23}; output:99
	find minimum number from given array. int[] input={1,11,44,23,55,99,23}; output:1
	print difference between max and min number from given array. int[] input={}1,11,44,23,55,99,23; output:98
	print difference between max odd number and max even number from given array. input={1,11,44,23,55,99,23,22} output:55
*/

package sayali_V;

public class Assignment_14 {

	int[] input = { 1, 11, 44, 23, 55, 99, 23 };
	int[] input1 = { 1, 11, 44, 23, 55, 99, 23 };
	int maxNum = input[0];
	int minNum = input[0];
	int maxEvenNum = input[0];
	int maxOddNum = input[0];
	int diff;

	int findMaxNumber() {
		for (int index = 0; index < input.length; index++) {
			if (input[index] > maxNum) {
				maxNum = input[index];
			}
		}
		System.out.println(maxNum);
		return maxNum;
	}

	int findMinNumber() {
		for (int index = 0; index < input.length; index++) {
			if (input[index] < minNum) {
				minNum = input[index];
			}
		}
		System.out.println(minNum);
		return minNum;
	}

	int diffBetweenMaxAndMin() {
		System.out.println(maxNum - minNum);
		return maxNum - minNum;
	}

	int diffBetweenMaxOddandMaxEven() {
		int diff;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0 && input[index] > maxEvenNum) {
				maxEvenNum = input[index];
			}
		}
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 != 0 && input[index] > maxOddNum) {
				maxOddNum = input[index];
			}
		}
		if (maxEvenNum < maxOddNum) {
			diff = maxOddNum - maxEvenNum;
		} else {
			diff = maxEvenNum - maxOddNum;
		}
		System.out.println(diff);
		return diff;
	}

	public static void main(String[] args) {
		Assignment_14 assignment = new Assignment_14();
		System.out.println("Maximum number is:");
		assignment.findMaxNumber();
		System.out.println("minimum number is:");
		assignment.findMinNumber();
		System.out.println("Differnece between max and min number is:");
		assignment.diffBetweenMaxAndMin();
		System.out.println("Difference between max odd number and max even number is:");
		assignment.diffBetweenMaxOddandMaxEven();
	}
}
