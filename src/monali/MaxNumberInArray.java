package monali;

public class MaxNumberInArray {
	/*program 1 : find maximum number from given array.

	int[] input = {1,11,44,23,55,99,23};
	output : 99*/

		int getMaximumNumber(int[] input) {
			int maxNumber = 0;
			for (int index = 0; index < input.length; index++) {
				if (input[index] > maxNumber) {
					maxNumber = input[index];
				}
			}
			return maxNumber;
		}

		public static void main(String[] args) {
			MaxNumberInArray maxArray = new MaxNumberInArray();
			int[] input = { 1, 11, 44, 23, 55, 99, 23 };
			System.out.println("Maximum number in array : "+ maxArray.getMaximumNumber(input));
		}
	}


