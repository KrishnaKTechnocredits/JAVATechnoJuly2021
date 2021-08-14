package mayur;

public class Assignment11 {

	boolean verifyIsPrime(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	void requiredPrimeNumber(int reqNum) {
		int count = 0;
		int number = 2;
		System.out.println("First" + reqNum + " prime number are: ");
		while (count < reqNum) {
			if (verifyIsPrime(number)) {
				System.out.print(number + " ");
				count++;
			}
			number++;
		}
	}

	void requiredNumToGenerateSum(int requiredSum) {
		int sum = 0;
		int num = 1;
		while (sum < requiredSum) {
			sum =sum + num;
			num++;
			System.out.println("Required number to generate the sum greater than " + requiredSum + " is:" + (num - 1));
		}
	}

	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.requiredPrimeNumber(10);
		System.out.println();
		assignment11.requiredNumToGenerateSum(100);

	}
}
