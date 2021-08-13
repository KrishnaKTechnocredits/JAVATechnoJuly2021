package shantanu.assignment10;

public class PrimeNumber {
	
	int count, sum;
	void verifyNumberIsPrimeOrNot(int number) {
		boolean flag = true;
		for(int index = 2; index < number; index++) {
			if(number % index == 0) {
				flag = false;
				break;
			}		
		}
		if(flag) {
			System.out.println(number + " is prime");
			count++;
			sum = sum + number;
		}
	}
	
	void verifyNumberIsPrimeOrNotInRange(int start, int end) {
		for(int index = start; index <= end; index++) {
			verifyNumberIsPrimeOrNot(index);
		}
	}
	
	void displayCountOfPrimeNumbersInRange() {
		System.out.println("Total prime  numbers in range are: "+count);
	}
	
	void displaySumOfPrimeNumbersInRange() {
		System.out.println("Sum of prime numbers in range is: "+sum);
	}
	
	void displayAvgOfPrimeNumbersInRange() {
		System.out.println("Average of prime numbers in range is: " + (sum/count));
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber1 = new PrimeNumber();
		System.out.println("-------Checking for single number-------");
		primeNumber1.verifyNumberIsPrimeOrNot(7);
		
		PrimeNumber primeNumber2 = new PrimeNumber();
		System.out.println("-------Checking for range-------");
		primeNumber2.verifyNumberIsPrimeOrNotInRange(100, 120);
		primeNumber2.displayCountOfPrimeNumbersInRange();
		primeNumber2.displaySumOfPrimeNumbersInRange();
		primeNumber2.displayAvgOfPrimeNumbersInRange();
	}
}
