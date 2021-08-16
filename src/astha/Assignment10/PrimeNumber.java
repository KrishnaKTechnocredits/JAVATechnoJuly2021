package astha.Assignment10;

public class PrimeNumber {
	
	int count = 0;
	double sum = 0;
	double average = 0;

	void checkNumberIsPrime(int number) {
		boolean isPrime = true;
		for(int index=2; index<number; index++) {
			if(number%index == 0) {
				isPrime = false;
				System.out.println(number+" is not a prime number");
				break;
			}
		}
			if (isPrime) {
				System.out.println(number+" is a prime number");
				count++;
				sum += number;
				average = sum/count;
			}
	}
	
	void printPrimeNumbersInRange(int startIndex, int endIndex) {
		for(int index=startIndex;index<=endIndex;index++) {
			checkNumberIsPrime(index);
		}
		System.out.println("Total prime numbers in the range is : "+count);
		System.out.println("Sum of the numbers is : "+sum);
		System.out.println("Average of the numbers is : "+average);
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.checkNumberIsPrime(27);
		primeNumber.printPrimeNumbersInRange(100,120);
	}
}
