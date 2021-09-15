/*Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 */

package varun.varun_string_assignment;

public class Scoding_Test_8 {
	int totalPair = 0;
	int pair = 0;

	void countNumberOfPairs(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			int count = 1;
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex] && arr[index] != 0) {
					count++;
					arr[innerIndex] =0;
				}
			}
			pair = count / 2;
			totalPair += pair;
		}
		System.out.println(totalPair);
	}

	public static void main(String[] args) {
		int[] input = { 3, 5, 6, 3, 5, 3, 7, 7, 8, 3, 3, 5, 8, 8 };
		Scoding_Test_8 scoding_Test_8 = new Scoding_Test_8();
		scoding_Test_8.countNumberOfPairs(input);
	}

}
