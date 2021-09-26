/*
 How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 
 */

package umakant;

public class Coding8 {

	int getNumberOfPairs(int[] input) {
		int totalPairs = 0;
		boolean[] isCounted = new boolean[input.length];
		for (int index = 0; index < input.length; index++) {
			if (!isCounted[index]) {
				int pairs = 1;
				for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
					if (input[index] == input[innerIndex]) {
						pairs++;
						isCounted[innerIndex] = true;
					}
				}
				totalPairs += pairs / 2;
			}
		}
		return totalPairs;
	}

	public static void main(String[] args) {
		int[] input = { 3, 5, 6, 3, 5, 3, 7, 7, 8, 3, 3, 5, 8, 8 };
		System.out.println(new Coding8().getNumberOfPairs(input));
	}

}
