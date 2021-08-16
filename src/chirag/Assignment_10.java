package chirag;

public class Assignment_10 {
	int primeNumberCounts;
	int averageOfPrimeNumbers;
	int sumOfPrimeNumbers;
	
	void verifyNumberIsPrimeNumber(int number) {
		boolean status=true;
		for(int index = 2;index < number;index++) {
			if(number % index == 0 ) {
				//System.out.println(number+" is not prime number");
				status = false;
			break;
		}
	}
		
	if(status==true) {
		System.out.println(number+ " is prime");
		primeNumberCounts = primeNumberCounts + 1;
		sumOfPrimeNumbers = sumOfPrimeNumbers + number;
		averageOfPrimeNumbers = sumOfPrimeNumbers / primeNumberCounts;
		}
	}
	
	void verifyPrimeNumberInRange(int startNum,int endNum) {
		for(int number = startNum;number <= endNum;number++) {
			verifyNumberIsPrimeNumber(number);
		}
	}
	void countOfPrimeNumbers() {
		System.out.println("Total Prime numbers count : "+primeNumberCounts);
	}
	
	void sumOfPrimeNumbers() {
		System.out.println("Sum of total Prime numbers : "+sumOfPrimeNumbers);
	}
	
	void averageOfPrimeNumbers() {
		System.out.println("Average of total Prime numbers : "+averageOfPrimeNumbers);
	}
	
	public static void main(String[] args) {
		Assignment_10 assignment_10 = new Assignment_10();
		System.out.println("Prime numbers in range 1 to 25"+"\n");
		assignment_10.verifyPrimeNumberInRange(1, 25);
		System.out.println("------------------------");
		assignment_10.countOfPrimeNumbers();
		System.out.println("------------------------");
		assignment_10.sumOfPrimeNumbers();
		System.out.println("------------------------");
		assignment_10.averageOfPrimeNumbers();
	}
}