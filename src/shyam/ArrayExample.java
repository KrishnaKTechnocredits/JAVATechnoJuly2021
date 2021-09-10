package shyam;

public class ArrayExample {
	int maxOddNumber;
	int maxEvenNumber;
	public static void main(String[] args) {
		int[] inputArray = { 12, 187, 11, 1090, 43, 55, 99, 23, 125 };
		ArrayExample arrayExample = new ArrayExample();
		arrayExample.findMaxNumberInArray(inputArray);
		System.out.println("Maximum Odd number found in the given array is : " + arrayExample.maxOddNumber);
		System.out.println("Maximum Even number found in the given array is : " + arrayExample.maxEvenNumber);
		int difference;
		if(arrayExample.maxOddNumber > arrayExample.maxEvenNumber)
			difference= arrayExample.maxOddNumber - arrayExample.maxEvenNumber;
		else
			difference= arrayExample.maxEvenNumber - arrayExample.maxOddNumber;
		System.out.println("Difference between Maximum Even number and Maximum Odd number found in the given array is : "
				+ difference);
	}

	void findMaxNumberInArray(int[] arrayInput) {
		if(arrayInput[0] % 2 == 0)
			maxEvenNumber = arrayInput[0];
		else
			maxOddNumber = arrayInput[0];
		for(int index = 0 ; index < arrayInput.length; index++) {
			if(arrayInput[index] % 2 == 0) {
				if(maxEvenNumber < arrayInput[index])
					maxEvenNumber = arrayInput[index];
			}else if(maxOddNumber < arrayInput[index])
				maxOddNumber = arrayInput[index];
		}
	}
}