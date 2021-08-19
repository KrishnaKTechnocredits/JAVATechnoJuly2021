package monika;

public class Assignment14_Program_4 {
	int getMaximumMinimumNumberDifference(int[] number) {
		int maxEven = 0;
		;
		int maxOdd = 0;
		for (int index = 0; index < number.length; index++) {
			if (number[index] % 2 == 0) {
				if (number[index] > maxEven)
					maxEven = number[index];
			} else if (number[index] > maxOdd)
				maxOdd = number[index];

		}
		if (maxOdd - maxEven > 0)
			return maxOdd - maxEven;
		else
			return maxEven - maxOdd;
	}

	public static void main(String[] args) {
		int[] input = { 1, 11, 44, 23, 55, 99, 23, 22 };
		Assignment14_Program_4 assignment14_Program_4 = new Assignment14_Program_4();
		System.out.println("Difference between maximum Odd and maximum Even number from given Array is "
				+ assignment14_Program_4.getMaximumMinimumNumberDifference(input));
	}
}
