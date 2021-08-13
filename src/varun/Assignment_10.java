package varun;

public class Assignment_10 {
	int count;
	static int sum;

	void printGivenNumberIsPrime(int num) {
		boolean flag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(num + " is prime");
			sum = sum + num;
			count++;
		}

	}

	void printPrimeNumberFromGivenRange(int startNum, int endNum) {
		for (int index = startNum; index <= endNum; index++) {
			printGivenNumberIsPrime(index);
		}
	}

	void displayCountSumAndAvrgOfPrimeNumber() {
		float avrg;
		avrg = sum / count;
		System.out.println("Total count of prime number from given range is " + count);
		System.out.println("Sum of all prime Number from give range is " + sum);
		System.out.println("Avrg of prime number from given range is " + avrg);
	}

	public static void main(String[] args) {
		Assignment_10 assignment_10 = new Assignment_10();
		//assignment_10.printGivenNumberIsPrime(23);
		assignment_10.printPrimeNumberFromGivenRange(100,120 );
		assignment_10.displayCountSumAndAvrgOfPrimeNumber();
	}
}
