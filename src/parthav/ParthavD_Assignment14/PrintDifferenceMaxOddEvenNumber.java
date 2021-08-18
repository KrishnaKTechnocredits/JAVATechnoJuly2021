package parthav.ParthavD_Assignment14;

public class PrintDifferenceMaxOddEvenNumber {
	int maxOddNumber;
	int maxEvenNumber;

	void printDifferenceMaxOddEvenNumber(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				if (maxEvenNumber < arr[index])
					maxEvenNumber = arr[index];
			} else {
				if (maxOddNumber < arr[index])
					maxOddNumber = arr[index];

			}

		}

		if (maxOddNumber >= maxEvenNumber)
			System.out.println("The difference betwee max odd and max even number in the passed array is: "
					+ (maxOddNumber - maxEvenNumber));
		else
			System.out.println("The difference betwee max odd and max even number in the passed array is: "
					+ (maxEvenNumber - maxOddNumber));

	}

	public static void main(String[] args) {

		int[] inputArray1 = { 1, 11, 44, 23, 55, 99, 23 };
		MaxNumberFromArray max = new MaxNumberFromArray();
		System.out.println("--------------------------Program1---------------------");
		max.printMaxNumberFromArray(inputArray1);

		int[] inputArray2 = { 1, 11, 44, 23, 55, 99, 23 };
		MinNumberFromArray min = new MinNumberFromArray();
		System.out.println("--------------------------Program2---------------------");
		min.printMinNumberfromArray(inputArray2);

		int[] inputArray3 = { 1, 11, 44, 23, 55, 99, 23 };
		PrintDifferenceBetweenMaxMin printDiffObject1 = new PrintDifferenceBetweenMaxMin();
		System.out.println("--------------------------Program3---------------------");
		printDiffObject1.printMinNumberfromArray(inputArray3);
		printDiffObject1.printMaxNumberFromArray(inputArray3);
		printDiffObject1.printMaxMinNumberDifference();
		
		int[] inputArray = { 1, 11, 44, 23, 55, 99, 23, 22 };
		PrintDifferenceMaxOddEvenNumber printDiffObject = new PrintDifferenceMaxOddEvenNumber();
		System.out.println("--------------------------Program4---------------------");
		printDiffObject.printDifferenceMaxOddEvenNumber(inputArray);

	}

}
