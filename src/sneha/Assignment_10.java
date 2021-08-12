package sneha;

public class Assignment_10 {
	
	static int count = 0; 

	void verifyNumberIsPrime(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				break;
			}
		}
		if (status)
			System.out.println(number + " is prime");
	}

	void verifyPrimeNumberInRange(int startNumber, int endNumber) {
		for (int number = startNumber; number <= endNumber; number++) {
			verifyNumberIsPrime(number);
		}
	}

	void sumPrimeNumber(int startNumber, int endNumber) {
		int sum = 0;
		
		for(int number = startNumber; number <= endNumber; number++) {
			for(int index = 2; index<endNumber; index++) {
				if(number % index != 0) {
					break;
				}
				sum = sum + number;
			}	
		}
		System.out.println("Sum of prime numbers in range is :" + sum);
	}
	
	void primeAverage(int startNumber, int endNumber) {
		int sum = 0, avg = 0;
		for(int number = startNumber; number <= endNumber; number++) {
			for(int index = 2; index<endNumber; index++) {
				if(number % index != 0) {
					sum = sum + number;
					count++;
				}
			}
				
		}
		avg = sum/count;
		System.out.println("Average of prime numbers in range is : " + avg);
	}
		
	

	public static void main(String[] a) {
		Assignment_10 assignment_10 = new Assignment_10();
		assignment_10.verifyPrimeNumberInRange(10, 30);
		assignment_10.sumPrimeNumber(3, 5);
		assignment_10.primeAverage(10, 20);
		
	}
}
