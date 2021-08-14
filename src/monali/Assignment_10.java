package monali;

public class Assignment_10 {
	
		int countPrime;
		int sumPrime;
		int averagePrime;

		void verifyNumberIsPrime(int number) {
			boolean flag = true;
			for (int index = 2; index < number; index++) {
				if (number % index == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(number + " is prime number");
				countPrime = countPrime + 1;
				sumPrime = sumPrime + number;
				averagePrime = sumPrime / countPrime;
			}
		}

		void verifyPrimeNumberInRange(int startNumber, int endNumber) {
			System.out.println("-----Prime Numbers in Range of 100 to 120-----");
			for (int number = startNumber; number < endNumber; number++) {
				verifyNumberIsPrime(number);
			}
		}

		void countPrimeInRange() {
			System.out.println("Count of prime numbers in range of 100 to 120 ---> "+countPrime);
		}
	 
		void sumPrimeNumbers() {
			System.out.println("Sum of prime numbers in range of 100 to 120 ---> "+sumPrime);
		}

		void averagePrimeNumbers() {
			System.out.println("Average of prime numbers in range of 100 to 120 ---> "+averagePrime);
		}

		public static void main(String[] args) {
			Assignment_10 primeOrNot = new Assignment_10();
			primeOrNot.verifyPrimeNumberInRange(100, 120);
			primeOrNot.countPrimeInRange();
			primeOrNot.sumPrimeNumbers();
			primeOrNot.averagePrimeNumbers();
			primeOrNot.verifyNumberIsPrime(17);
			
		}
	}


