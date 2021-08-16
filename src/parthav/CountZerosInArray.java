//Assignment 13;

package parthav;

public class CountZerosInArray {
	int countOfZeros;

	int getCountOfZerosInArray(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0) {
				countOfZeros++;
			}
		}
		return countOfZeros;
	}

}
