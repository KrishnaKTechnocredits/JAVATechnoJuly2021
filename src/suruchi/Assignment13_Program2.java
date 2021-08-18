package suruchi;

public class Assignment13_Program2 {

	int count = 0;

	int getCountOfZeroes(int[] num) {

		for (int index = 0; index < num.length; index++) {
			if (num[index] == 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {

		Assignment13_Program2 assignment13_Program2 = new Assignment13_Program2();
		int[] input = { 1, -11, 0, 0, 55, 0, -23, 0 };
		System.out.println("Array of numbers is as displayed: ");
		for (int index = 0; index < input.length; index++)
			System.out.print(input[index] + " ");
		System.out.println();
		System.out.println("Number of zeroes in the array is: " + assignment13_Program2.getCountOfZeroes(input));
	}
}