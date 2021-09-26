/*Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 */

package shraddha.CodingTest8;

import java.util.Arrays;

public class PairOfSocks {
	public static void main(String[] args) {
		int[] socksArray = { 3, 5, 6, 3, 5, 3, 7, 7, 8, 3, 3, 5, 8, 8 };

		int pairOfSocks = 0;
		System.out.println("Given Socks Array is :- " + Arrays.toString(socksArray));
		for (int index = 0; index < socksArray.length; index++) {
			int socksCount = 1;
			for (int innerIndex = index + 1; innerIndex < socksArray.length; innerIndex++) {
				if (socksArray[index] == socksArray[innerIndex] && socksArray[index] != 0) {
					socksCount++;
					socksArray[innerIndex] = 0;
				}
			}
			pairOfSocks += socksCount / 2;
		}
		System.out.println("Pair of socks from above array is :- " + pairOfSocks);
	}

}
