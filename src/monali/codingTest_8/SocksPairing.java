package monali.codingTest_8;

/*Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5*/
public class SocksPairing {

	void getSocksPairingCount(int[] input) {
		int[] output = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = input[index];
		}

		int totalPairs = 0;
		for (int index = 0; index < input.length; index++) {
			int count = 0;
			for (int index2 = 0; index2 < input.length; index2++) {
				if (input[index] == output[index2] && output[index2] != 0) {
					count++;
					output[index2] = 0;
				}

			}
			totalPairs += count / 2;
		}
		System.out.println(totalPairs);
	}

	public static void main(String[] args) {
		SocksPairing test8 = new SocksPairing();
		int[] input = { 3, 5, 6, 3, 5, 3, 7, 7, 8, 3, 3, 5, 8, 8 };
		// int [] input={3,3,3,3,3,3,3,3,3,3};
		test8.getSocksPairingCount(input);
	}
}
