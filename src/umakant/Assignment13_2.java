package umakant;

public class Assignment13_2 {

	int getNumberOfZeroes(int[] numbers) {
		int count = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] == 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment13_2 assignment13_2 = new Assignment13_2();
		int[] input = { 1, -11, 0, 0, 55, 0, -23, 0 };
		System.out.print(assignment13_2.getNumberOfZeroes(input));
	}

}
