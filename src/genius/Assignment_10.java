package genius;

public class Assignment_10 {
	int count;
	int sum;

	void verifyIfNumberIsPrime(int number) {
		boolean status = true;
		for (int index=2; index<number; index++) {
			if (number%index == 0) {
				status = false;
				break;
			}
		}
		if(status==true) {
			count++;
			System.out.println(number + " is a prime number");
			sum = sum+number;
		}
	}

	void verifyPrimeNumberInRange(int startNumber, int endNumber) {
		System.out.println("Prime numbers in given range");
		for (int index = startNumber; index <= endNumber; index++) {
			verifyIfNumberIsPrime(index);
		}
	}

	void countOfPrimeNumbers() {
		System.out.println("Count of prime numbers is " + count);
	}
	void sumOfPrimeNumbers() {
		System.out.println("Sum of prime numbers is " + sum);
	}
	void averageOfPrimeNumbers() {	
		System.out.println("Average of prime numbers is " + ((float) sum / count));
	}

	public static void main(String[] args) {
		Assignment_10 assignment_10 = new Assignment_10();
		assignment_10.verifyPrimeNumberInRange(100, 120);
		assignment_10.countOfPrimeNumbers();
		assignment_10.sumOfPrimeNumbers();
		assignment_10.averageOfPrimeNumbers();
	}
}
