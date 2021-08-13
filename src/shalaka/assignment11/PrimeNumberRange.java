package shalaka.assignment11;

public class PrimeNumberRange {

	void printFirstNPrimeNumbers(int count) {
		int num = 2;
		while (count > 0) {
			boolean isPrime = true;
			for (int index = 2; index < num; index++) {
				if (num % index == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(num + " is Prime number");
				count--;
			}
			num++;
		}
	}

	public static void main(String[] args) {
		PrimeNumberRange primeNumberRange = new PrimeNumberRange();
		primeNumberRange.printFirstNPrimeNumbers(10);
	}

}
