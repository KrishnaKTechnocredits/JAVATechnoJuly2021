package aniket;

public class PrimeNumbers {
	int count = 0;
	int sum =0;
	float avg=0;

	void verifyPrime(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {

			if (number % index == 0) {
				status = false;
				break;
			}

		}
		if (status) {
			System.out.println(number + " is prime number");
			count++;
			sum=sum+number;
			avg=(float)sum/count;
		}
	}

	void primeNumberInRange(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			verifyPrime(index);
		}

	}

	void verifyPrimeNumberRange(int startindex, int endindex) {
		for (int index = startindex; index <= endindex; index++)
			verifyPrime(index);
	}

	void countPrimeNumbers() {
		System.out.println("Total prime numbers are :" + count);
	}
	
	void sumofPrimeNumbers() {
		System.out.println("Sum of all prime number is :"+sum);
		
	}
	
	void averageofPrimeNumbers() {
		System.out.println("Aveage of prime number is :"+avg);
		
	}

	public static void main(String[] args) {
		PrimeNumbers primenumbers = new PrimeNumbers();
		primenumbers.verifyPrime(23);
		primenumbers.verifyPrimeNumberRange(100, 120);
		primenumbers.countPrimeNumbers();
		primenumbers.sumofPrimeNumbers();
		primenumbers.averageofPrimeNumbers();
	}

}
