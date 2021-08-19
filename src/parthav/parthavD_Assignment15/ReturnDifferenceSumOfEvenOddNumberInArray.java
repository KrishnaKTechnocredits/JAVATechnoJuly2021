package parthav.parthavD_Assignment15;

public class ReturnDifferenceSumOfEvenOddNumberInArray {

	int returnDifference(int[] inputArr) {
		int sumEvenNumber = 0;
		int sumOddNumber = 0;

		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index] % 2 == 0) {
				sumEvenNumber += inputArr[index];
			} else
				sumOddNumber += inputArr[index];
		}

		if (sumEvenNumber >= sumOddNumber)
			return (sumEvenNumber - sumOddNumber);
		else
			return (sumOddNumber - sumEvenNumber);
	}

}
