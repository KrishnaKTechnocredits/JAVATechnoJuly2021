package rasika;

public class Assignment10 {
	int count = 0;
	int sum = 0;
	void verifyPrimeNumber(int number) {
		boolean status = true;
		for(int index = 2; index < number; index++) {
			if(number % 2 == 0) {
				status = false;
				System.out.println(number+ " is not prime number.");
				break;
			}
		}
		if(status) {
			count++;
			System.out.println(number+ " is a prime number.");
			sum = sum + number;
		}
	}
	void verifyPrimeNumberBetweenRange(int startIndex, int endIndex) {
		System.out.println("Prime numbers between the provided range are ");
		for(int index = startIndex; index <= endIndex; index++) {
			verifyPrimeNumber(index);
		}
	}
	void totalCountOfPrimeNumbers(){
		System.out.println("Total count of prime numbers is "+count);
	}
	void sumOfPrimeNumbers() {
		System.out.println("Total Sum of prime numbers is "+sum);
		
	}
	void averageOfPrimeNumbers() {
		int average = sum / 2;
		System.out.println("The average is "+average);
	}
	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.verifyPrimeNumber(17);
		assignment10.verifyPrimeNumber(18);
		assignment10.verifyPrimeNumberBetweenRange(100,120);
		assignment10.totalCountOfPrimeNumbers();
		assignment10.sumOfPrimeNumbers();
		assignment10.averageOfPrimeNumbers();
	}
}
