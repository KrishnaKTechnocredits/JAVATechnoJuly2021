package shraddha.ArrayExamples;

public class FindMinNoArray {
	int minNumber;
	public static void main(String[] args) {
		int[] inputArray = {125,11,43,55,99,23,5};
		FindMinNoArray findMinNumber = new FindMinNoArray();
		findMinNumber.findMinNumberInArray(inputArray);
		System.out.println("Minimum number found in the given array is :- "+findMinNumber.minNumber);
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
