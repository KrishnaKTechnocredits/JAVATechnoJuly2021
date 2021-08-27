package akshay;

public class PrimeNumber {
	int count = 0;
	int sum = 0;
	float average;
	
	void verifyPrimeNumbers(int number) {
		boolean status = true;
		for(int index = 2; index < number; index++) {
			if(number % index == 0) {
				status = false;
				//System.out.println(number + " is not a prime number");
				break;
			}	
		}
		if (status == true) {
			System.out.println(number + " is prime number");
			count++;
			sum = sum + number;
			average = (float)sum / count;
		}
	}
	
	void verifyPrimeNumberRange(int startindex, int endindex) {
		for (int index = startindex; index <= endindex; index++)
			verifyPrimeNumbers(index);
	}
	
	void countPrimeNumber() {
		System.out.println("Total prime numbers: " + count);
	}
	
	void sumofPrimeNumbers() {
		System.out.println("Sum of prime numbers: " + sum);
	}
	
	void averageofPrimeNumbers() {
		System.out.println("Averag of prime number: " + average );
	}
	
	public static void main(String[] args) {
		PrimeNumber primenumber = new PrimeNumber();
		primenumber.verifyPrimeNumbers(10);
		primenumber.verifyPrimeNumberRange(100, 120);
		primenumber.countPrimeNumber();
		primenumber.sumofPrimeNumbers();
		primenumber.averageofPrimeNumbers();
	}
}
