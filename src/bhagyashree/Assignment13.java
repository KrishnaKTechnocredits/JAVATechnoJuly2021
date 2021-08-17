package bhagyashree;

public class Assignment13 {

	int getCountofPositiveNumber(int[] array) {
		int count = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] > 0)
				count++;

		}
		// System.out.println("Total count of positive Numbers in give array is:
		// "+count);
		return count;

	}// count no of positive numbers

	int getCountofZero(int[] array) {
		int count = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] == 0)
				count++;
		}
		return count;
	}// count no of zero in given array

	int[] getSmallerNumber(int number) {
		int[] output = new int[5];
		int count = 0;
		for (int index = number; index > number - 5; number--) {
			if (count != 5) {
				output[count] = number - 1;
				System.out.println(output[count]);
				count++;
			}

		}
		return output;
	}// return 5 small numbers from given number

	public static void main(String[] args) {
		int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
		Assignment13 assignment13 = new Assignment13();
		System.out.println(
				"Total count of positive Numbers in give array is: " + assignment13.getCountofPositiveNumber(input));

		int[] input1 = { 1, -11, 0, 0, 55, 0, -23, 0 };
		System.out.println("Total Count of Zero in Given Array is: " + assignment13.getCountofZero(input1));

		System.out.println("Five smaller number from given number are: " + assignment13.getSmallerNumber(50));
	}

}
