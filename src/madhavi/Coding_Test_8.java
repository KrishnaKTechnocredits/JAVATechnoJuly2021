package madhavi;

public class Coding_Test_8 {
	int getSockPairs(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			int count = 1;
			for (int j = index + 1; j < input.length; j++) {
				if ((input[index] == input[j])) {
					count++;
				}
			}
			if (count % 2 == 0) {
				sum++;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		Coding_Test_8 coding_Test_8 = new Coding_Test_8();
		int input[] = { 3, 5, 6, 3, 5, 3, 7, 7, 8, 3, 3, 5, 8, 8 };
		System.out.println(coding_Test_8.getSockPairs(input));

	}
}