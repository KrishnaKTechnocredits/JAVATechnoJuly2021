package technocredits1;

public class PrimeNumber {
	void verifyNumberIsPrime(int number) {
		boolean status = true;
		for(int index=2;index<number;index++)  {
			if(number % index == 0) {
				status = false;
				System.out.println(number + " is not a prime number");
				break;
			}
		}
		if(status) {
			System.out.println(number + " is prime");
		}
	}
	
	
	void verifyPrimeNumberInRange(int startNumber, int endEndNumber) {
		for(int number = startNumber; number<=endEndNumber;number++) {
			verifyNumberIsPrime(number);
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.verifyPrimeNumberInRange(100, 120);
		System.out.println("End");
	}
}
