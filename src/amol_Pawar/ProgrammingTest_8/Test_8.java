/*Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5*/

//Time Required =25 min
package amol_Pawar.ProgrammingTest_8;

public class Test_8 {

	void getPairedSocks(int[] input) {
		int totalPairs = 0;
		for (int index = 0; index < input.length; index++) {
			int count = 1;
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex] && input[index] != 0) {
					count++;
					input[innerIndex] = 0;
				}
			}
			count = count / 2;

			totalPairs = totalPairs + count;

		}
		System.out.println("Total pair of socks are:" + totalPairs);
	}

	public static void main(String[] args) {

		Test_8 test_8 = new Test_8();
		int[] input = { 3, 5, 6, 3, 5, 3, 7, 7, 8, 3, 3, 5, 8, 8 };
		test_8.getPairedSocks(input);
	}
}
