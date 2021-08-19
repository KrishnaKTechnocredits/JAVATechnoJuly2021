package sourabh;

public class PrimeNoUsingWhile {
	int sum, reqSum, primeNumberCount;

	void findPrimeNumber(int number) {
			boolean status = true;
			int index=2;
			while(index<number) {
				if (number%index == 0) {
					status = false;
					break;
				}
				index ++;
			}
			if (status) {
				System.out.println(" " + number + " is a prime number");
				primeNumberCount ++;
			}
	}

	void printNPrimeNumbers(int range) {
		int index=2;
		while (primeNumberCount<range) {
			findPrimeNumber(index);
			index ++;
		}
	}

	void generateSum(int number) {
		int index=1;
		while(sum<=number) {
			sum = sum + index;
			index ++;
			reqSum ++;
		}
		System.out.println(" \n The required numbers to generate the sum more than " + number + " are: " + reqSum);
	}

	public static void main(String[] args) {
		PrimeNoUsingWhile assignment_11 = new PrimeNoUsingWhile();
		System.out.println("\n First 10 Prime Numbers are: ");
		assignment_11.printNPrimeNumbers(10);
		assignment_11.generateSum(100);
	}
}
