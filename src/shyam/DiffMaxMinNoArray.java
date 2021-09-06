package shyam;

public class DiffMaxMinNoArray {
	int maxNumber;
	int minNumber;

	public static void main(String[] args) {
		int[] inputArray = { 12, 115, 11, 109, 43, 55, 99, 23, 125 };
		DiffMaxMinNoArray diff = new DiffMaxMinNoArray();
		diff.findMaxNumberInArray(inputArray);
		diff.findMinNumberInArray(inputArray);
		System.out.println("Maximum number found in the given array is : " + diff.maxNumber);
		System.out.println("Minimum number found in the given array is : " + diff.minNumber);
		System.out.println("Difference between Maximum number and Minimun number in the given array is : " + (diff.maxNumber - diff.minNumber));
	}

	int findMaxNumberInArray(int[] arrayInput) {
		maxNumber = arrayInput[0];
		for(int index = 0 ; index < arrayInput.length; index++) {
				if(maxNumber < arrayInput[index])
					maxNumber = arrayInput[index];
		}
		return maxNumber;
	}

	int findMinNumberInArray(int[] arrayInput) {
		minNumber = arrayInput[0];
		for(int index = 0 ; index < arrayInput.length; index++) {
				if(minNumber > arrayInput[index])
					minNumber = arrayInput[index];
		}
		return minNumber;
	}
}