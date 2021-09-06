package varun.varun_string_assignment;

public class SecondHighestNumberFromArray {

	void findSecondHighestFromArray(int[] inputArr) {

		int highestInArray = 0;
		int secondHighestInArray = 0;
		int[] newInputArr = new int[inputArr.length];

		highestInArray = getHighestFromArray(inputArr);
		newInputArr = getArrayWithoutHighest(inputArr, highestInArray);
		secondHighestInArray = getHighestFromArray(newInputArr);

		System.out.println("The second highest number in the array is: " + secondHighestInArray);

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
		int[] inputArr = { 10, 23, 2, 101, 55, 43, 99 };
		SecondHighestNumberFromArray secondHighestNumberFromArray = new SecondHighestNumberFromArray();
		secondHighestNumberFromArray.findSecondHighestFromArray(inputArr);

	}
	
}
