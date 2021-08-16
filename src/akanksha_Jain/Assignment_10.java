package akanksha_Jain;

public class Assignment_10 {
	float count;
	static float sum;
	
	void findPrimeNumber(int number) {
		boolean status=true;
		for (int index=2; index<=number-1; index++) {
			if (number % index == 0 ) {
				status = false;
				break;
			}
		}
		if(status) {
			System.out.println(number + " is prime number");
			count ++;
			sum = sum + number;
		}
	}
	
	void findPrimeNumberInRange(int startNumber, int endNumber) {
		for (int number=startNumber; number<=endNumber; number++) {
			findPrimeNumber(number);
		}
	}
	
	void countPrimeNumbers() {
		System.out.println("Total number of prime numbers between given range are: " + count);
	}
	
	void sumPrimeNumbers() {
		System.out.println("Sum of all prime numbers between given range is: " + sum); 
	}
	
	void averagePrimeNumbers() {
		float avg;
		avg = sum/count;
		System.out.println("Average of all prime numbers between given range is: " + avg); 
	}
	
	public static void main(String[] args) {
		Assignment_10 assignment_10 = new Assignment_10();
		assignment_10.findPrimeNumberInRange(100, 120);
		assignment_10.countPrimeNumbers();
		assignment_10.sumPrimeNumbers();
		assignment_10.averagePrimeNumbers();
	}
}