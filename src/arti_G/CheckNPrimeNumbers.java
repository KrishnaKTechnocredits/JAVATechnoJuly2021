package arti_G;

//Assignment_11
public class CheckNPrimeNumbers {

	int numberCount;
	int sum;

	void verifyPrimeNumber(int n) {
		int count = 0;
		int num = 2;
		System.out.println("The First prime numbers are below :");
		while (count != n) {
			boolean flag = true;
			int index = 2;
			while (index < num) {
				if (num % index == 0) {
					flag = false;
					break;
				}
				index++;
			}
			if (flag) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}

	void printNumbersWithRequiredSum(int number) {
		int index = 1;
		while (number >= sum) {
			sum += index;
			index++;
			numberCount++;
		}

		System.out
				.println("The total numbers required to generate sum of more than " + number + " are: " + numberCount);
	}

	public static void main(String[] args) {
		CheckNPrimeNumbers checkNPrimeNumbers = new CheckNPrimeNumbers();
		checkNPrimeNumbers.verifyPrimeNumber(10);
		checkNPrimeNumbers.printNumbersWithRequiredSum(150);

	}

}
