package monali;

public class CountOfPositiveNumberInArray {

		/*
		 * program 1 : return count of positive numbers from given array. int[]
		 * input = {1,-11,-44,23,55,-99,-23,-22}; output : 3
		 */

		int countPositiveNumber(int[] input) {
			int count = 0;
			for (int index = 0; index < input.length; index++) {
				if (input[index] > 0)
					count++;
			}
			return count;
		}

		int processData() {
			int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
			return countPositiveNumber(input);
		}

		public static void main(String[] args) {
			CountOfPositiveNumberInArray countPositiveNumbers = new CountOfPositiveNumberInArray();
			System.out.println("Count of positive numbers in array: "+countPositiveNumbers.processData());
		}
	}


