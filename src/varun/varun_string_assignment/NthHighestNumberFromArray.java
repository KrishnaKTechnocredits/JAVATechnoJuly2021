package varun.varun_string_assignment;

public class NthHighestNumberFromArray {
	void findNthFromArray(int[] inputArr, int nThHighest) {
		int nThHighestInArray = 0;
		if (nThHighest != 1) {
			for (int iteration = 0; iteration < nThHighest - 1; iteration++) {
				nThHighestInArray = getHighestFromArray(inputArr);
				inputArr = getArrayWithoutHighest(inputArr, nThHighestInArray);
				nThHighestInArray = getHighestFromArray(inputArr);

			}

		} else
			nThHighestInArray = getHighestFromArray(inputArr);
			System.out.println("The " +  nThHighest + "th highest number in the array is: " + nThHighestInArray);
	}
	int[] getArrayWithoutHighest(int[] inputArr, int highestFromArray) {
		int[] newInputArr = new int[inputArr.length];
		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index] != highestFromArray)
				newInputArr[index] = inputArr[index];
		}
		return newInputArr;
	}
	int getHighestFromArray(int[] inputArr) {
		int highestFromArray = 0;
		for (int index = 0; index < inputArr.length; index++) {
			if (highestFromArray < inputArr[index]) {
				highestFromArray = inputArr[index];
			}
		}
		return highestFromArray;
	}

	public static void main(String[] args) {
		int[] inputArr = { 10, 23, 2, 11, 55, 43, 99 };
		NthHighestNumberFromArray nthHighestNumberFromArray = new NthHighestNumberFromArray();
		nthHighestNumberFromArray.findNthFromArray(inputArr, 5);

	}
}

