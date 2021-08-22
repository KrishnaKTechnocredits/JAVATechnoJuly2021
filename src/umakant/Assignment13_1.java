package umakant;

public class Assignment13_1 {

	int getPositiveNumbersCount(int[] numbers) {
		int count = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] > 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment13_1 assignment13_1 = new Assignment13_1();
		int[] input = { 1, -11, -44, 23, 55, -9, -23, -22 };
		System.out.println(assignment13_1.getPositiveNumbersCount(input));
	}

}
