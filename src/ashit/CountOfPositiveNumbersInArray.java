package ashit;

public class CountOfPositiveNumbersInArray {

	int countPositiveNumbersInArray;

	int getCountOfPositiveNumInArray(int[] arr) {

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				countPositiveNumbersInArray++;
			}

		}
		return countPositiveNumbersInArray;
	}

}