package parthav;

public class FindFirstFivePerfectNumbers {
	int countOfPerfectNumbers = 0;
	int startNumber = 1;

	void printFirstNPerfectNumbers(int number) {

		System.out.println("The first five Perfect Numbers are: ");
		while (countOfPerfectNumbers < number) {
			checkIfPerfectNumber(startNumber);
			startNumber++;
		}

	}

	void checkIfPerfectNumber(int number) {
		int sumOfDivisibleNumbers = 0;
		if (number > 1) {
			for (int index = 1; index <= number / 2; index++) {
				if (number % index == 0) {
					sumOfDivisibleNumbers += index;
				}
			}
			if (sumOfDivisibleNumbers == number) {
				countOfPerfectNumbers++;
				System.out.println(number + " is a perfect number");
			}
		}

	}

	public static void main(String[] args) {
		FindFirstFivePerfectNumbers newObject = new FindFirstFivePerfectNumbers();
		newObject.printFirstNPerfectNumbers(5);
		
	}

}
