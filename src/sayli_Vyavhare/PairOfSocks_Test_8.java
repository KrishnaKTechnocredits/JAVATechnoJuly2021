/*Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. 
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 */
package sayli_Vyavhare;

import java.util.Arrays;

public class PairOfSocks_Test_8 {

	void getPair(int[] input) {
		System.out.println("Given array is: " + Arrays.toString(input));
		int output = 0, pairCount = 0;
		for (int index = 0; index < input.length - 1; index++) {
			int count = 1;
			for (int innerindex = index + 1; innerindex < input.length; innerindex++) {
				if (input[index] == input[innerindex] && input[innerindex] != 0) {
					count++;
					input[innerindex] = 0;
				}
			}
			output = count / 2;
			pairCount += output;

		}
		System.out.println("Pairs can be created from above sock size array : " + pairCount);
	}

	public static void main(String[] args) {
		PairOfSocks_Test_8 test = new PairOfSocks_Test_8();
		int[] input = { 3, 5, 6, 3, 5, 3, 7, 7, 8, 3, 3, 5, 8, 8 };

		test.getPair(input);
	}

}
