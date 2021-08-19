package suruchi;

public class Assignment13_Program1 {

	int count = 0;

	int getPositiveNumbersCount(int[] num) {

		for (int index = 0; index < num.length; index++) {
			if (num[index] > 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {

		Assignment13_Program1 assignment13_Program1 = new Assignment13_Program1();
		int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
		System.out.println("Array of numbers is as displayed: ");
		for (int index = 0; index < input.length; index++)
			System.out.print(input[index] + " ");
		System.out.println();
		System.out.println(
				"Count of positive numbers in the array is: " + assignment13_Program1.getPositiveNumbersCount(input));
	}
}