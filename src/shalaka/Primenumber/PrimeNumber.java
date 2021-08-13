package shalaka.Primenumber;

public class PrimeNumber {
	int count;
	int primeSum;
	int primeAvg;
	void verifyNumberIsPrime(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				//System.out.println(number + "is not a prime number");
				status = false;
				break;
			}
		}
		if(status) {
			System.out.println(number + "is a prime number");
		     count++;
		     primeSum+= number;
		     primeAvg = primeSum/count;
		}

	}

	void verifyPrimeNumberInRange(int startNo, int endNo) {
		for (int number = startNo; number <= endNo; number++) {
			verifyNumberIsPrime(number);
		
		}
	}
	void displaycount() {
		System.out.println("Count of prime number is "+count);
	}
	
	void displayPrimeSum() {
		System.out.println("Sum of prime number is "+primeSum);
	}
	void displayAvg() {
		System.out.println("Average of prime number is "+primeAvg);
	}
	
	public static void main(String [] args) {
		PrimeNumber primenumber = new PrimeNumber();
		//primenumber.verifyNumberIsPrime(29);
		System.out.println("_ _ _ _ _ _ _ _ _");
		primenumber.verifyPrimeNumberInRange(100,120);
		primenumber.displaycount();
		System.out.println("_ _ _ _ _ _ _ _ _");
		primenumber.displayPrimeSum();
		System.out.println("_ _ _ _ _ _ _ _ _");
		primenumber.displayAvg();
	}
}
