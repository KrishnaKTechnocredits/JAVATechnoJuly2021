package monali;

public class CountZeroInArray {
		/*
		 * program 2 : count number of zero's in given array. int[] input =
		 * {1,-11,0,0,55,0,-23,0};
		 */

		int countZeroNumber(int[] input) {
			int count = 0;
			int zeroCounter = 0;
			for (int index = 0; index < input.length; index++) {
				if (input[index] == 0) {
					count++;
					zeroCounter = count;
				}
			}
			return zeroCounter;
		}

		int processData() {
			int[] input = { 1, -11, 0, 0, 55, 0, -23, 0 };
			return countZeroNumber(input);
		}

		public static void main(String[] args) {
			CountZeroInArray countZeroNumbers = new CountZeroInArray();
			System.out.println("Count of Zero in array: " + countZeroNumbers.processData());
		}
	}



