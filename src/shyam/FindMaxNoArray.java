package shyam;

public class FindMaxNoArray {
	int maxNumber;
	public static void main(String[] args) {
		int[] inputArray = {1,115,11,109,43,55,99,23,125};
		FindMaxNoArray findMaxNumber = new FindMaxNoArray();
		findMaxNumber.findMaxNumberInArray(inputArray);
		System.out.println("Maximum number found in the given array is : "+findMaxNumber.maxNumber);
	}

	int findMaxNumberInArray(int[] arrayInput) {
		maxNumber = arrayInput[0];
		for(int index = 0 ; index < arrayInput.length; index++) {
				if(maxNumber < arrayInput[index])
					maxNumber = arrayInput[index];
		}
		return maxNumber;
	}

}