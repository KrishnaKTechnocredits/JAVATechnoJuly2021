/*Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 */

package amol_Vyas;

import java.util.Arrays;

public class CodingTest_8 {

	int getCountNumber(int[] input, int number) {
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] == number) {
				count++;
				input[index] = 0;
			}
		}
		return count;
	}

	void getCountPairOfNumbers(int[] input) {
		int count = 0, sum = 0;
		for (int index = 0; index < input.length - 1; index++) {
			if (input[index] != 0) {
				count = getCountNumber(input, input[index]);
				if (count > 1) {
					sum += count / 2;
				}
			}
		}
		System.out.println("Total pair of numbers is " + sum);

	}

	public static void main(String[] args) {
		int[] input = { 3, 5, 6, 3, 5, 3, 7, 7, 8, 3, 3, 5, 8, 8 };
		CodingTest_8 codingTest_8 = new CodingTest_8();
		codingTest_8.getCountPairOfNumbers(input);
	}
}
