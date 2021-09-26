package parthav.parthavD_Assignment15;

public class ReturnDifferenceEvenOddLength {
	int sumOddLength;
	int sumEvenLength;

	void getEvenOddLengthDifference(String[] arr) {

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() % 2 == 0) {
				sumEvenLength += arr[index].length();
			}

			else
				sumOddLength += arr[index].length();
		}

		if (sumOddLength >= sumEvenLength)
			System.out.println(
					"The difference between even length and odd length names is: " + (sumOddLength - sumEvenLength));
		else
			System.out.println(
					"The difference between even length and odd length names is: " + (sumEvenLength - sumOddLength));

	}

	public static void main(String[] args) {
		System.out.println("-------------------Program1-----------------------------");
		ReturnDifferenceEvenOddLength newObject = new ReturnDifferenceEvenOddLength();
		String[] inputArray = { "Maulik", "Techno", "Nidhi", "Ankit" };
		newObject.getEvenOddLengthDifference(inputArray);

		System.out.println("-------------------Program2-----------------------------");
		String inputArr[] = { "hello", "techno", "credits" };
		ReturnMiddleCharacterStringArray returnObject = new ReturnMiddleCharacterStringArray();
		returnObject.setStringArray(inputArr);
		returnObject.getMiddleCharacterInString();

		System.out.println("-------------------Program3-----------------------------");
		int[] inputArr1 = { 12, 2, 13, 9 };
		ReturnDifferenceSumOfEvenOddNumberInArray newReturnOject = new ReturnDifferenceSumOfEvenOddNumberInArray();
		System.out.println("The sum of difference between odd and even numbers in the passed array is: "
				+ newReturnOject.returnDifference(inputArr1));

		int[] inputArr2 = { 13, 22, 10, 3 };
		ReturnDifferenceSumOfEvenOddNumberInArray newReturnOject1 = new ReturnDifferenceSumOfEvenOddNumberInArray();
		System.out.println("The sum of difference between odd and even numbers in the passed array is: "
				+ newReturnOject1.returnDifference(inputArr2));

	}

}
