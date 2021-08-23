package neha;

/*program 4 : print difference between max odd number and max even number from given array. difference should be positive
int[] input = {1,11,44,23,55,99,23,22};
hint : 99 - 44
output : 55*/
public class Assignment14pg4 {
	int diffMaxOddAndEvenNumbersInArray(int[] inputArr) {
		int maxEvenNumber = inputArr[0];
		int maxOddNumber = inputArr[0];
		for (int index = 1; index < inputArr.length; index++) {
			if (inputArr[index] > maxEvenNumber && inputArr[index] % 2 == 0) {
				maxEvenNumber = inputArr[index];
			}
			if (inputArr[index] > maxOddNumber && inputArr[index] % 2 != 0) {
				maxOddNumber = inputArr[index];
			}
		}
		return maxOddNumber - maxEvenNumber;
	}

	public static void main(String[] args) {
		Assignment14pg4 assignment14pg4 = new Assignment14pg4();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Difference between max odd number and max even number from given array is: "
				+ assignment14pg4.diffMaxOddAndEvenNumbersInArray(input));
	}

}
