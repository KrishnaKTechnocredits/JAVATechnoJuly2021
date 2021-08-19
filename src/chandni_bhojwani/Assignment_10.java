package chandni_bhojwani;

public class Assignment_10 {
		 int primeCount = 0;
		 int sum = 0;
	
	void printPrimeNumber (int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				break;
				
			}
			}
		 if (status) {
		System.out.println (number + " is a prime number");
			primeCount++;
			sum = sum + number;
		 }
	
	}
	
		
	void findPrimeNumbersWithinRange (int startNum, int endNum) {
			primeCount = 0;
			sum = 0;
		for (int num = startNum; num <= endNum; num++) {
			printPrimeNumber (num); 
			
		}

	}
	
	void totalPrimeNumberInRange() {
			System.out.println("Count of Prime Numbers within range is " + primeCount);
		
	}
	
	void sumOfAllPrimeNumberInRange () {
			System.out.println("Count of Prime Numbers within range is " + sum);
			
	}
	
	void averageOfAllPrimeNumbers () {
		int avg = sum / primeCount;
		System.out.println ("Average of prime numbers withtin range is" + avg);
		
	}
	
	public static void main(String[] args) {
		Assignment_10 assignment_10 = new Assignment_10 ();
		assignment_10.printPrimeNumber(21);
		assignment_10.printPrimeNumber(311);
		System.out.println ("----------------------------------");
		assignment_10.findPrimeNumbersWithinRange(100, 120);
		System.out.println ("----------------------------------");
		assignment_10.totalPrimeNumberInRange();
		System.out.println ("----------------------------------");
		assignment_10.sumOfAllPrimeNumberInRange();
		System.out.println ("----------------------------------");
		assignment_10.averageOfAllPrimeNumbers();
	}
}

