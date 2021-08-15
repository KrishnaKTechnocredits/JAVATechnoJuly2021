package umakant;

public class Assignment13_3 {

	int[] getFiveSmallerNumbers(int number) {
		int[] output = new int[5];
		for (int index = 0; index < 5; index++) {
			number--;
			output[index] = number;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment13_3 assignment13_3 = new Assignment13_3();
		int input = 50;
		int[] output = assignment13_3.getFiveSmallerNumbers(input);
		for (int index = 0; index < output.length; index++) {
			System.out.print(output[index] + " ");
		}
	}

}
