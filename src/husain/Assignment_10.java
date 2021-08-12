package husain;

public class Assignment_10 {
	double countOfPrime;
	double sumOfPrime;
	
	void printIfNumberIsPrime(int number) {
		boolean status = true;
		for(int index = 2; index<=number-1; index++) {
			if(number % index == 0) {
				status = false;
				//System.out.println("The given number "+number+" is not a prime number");
				break;				
			}
		}
		if(status) {
			countOfPrime++;
			System.out.println(number);
			sumOfPrime = sumOfPrime + number;
		}
	}
	
	void printPrimeNumbersInaGivenRange(int startRange, int endRange) {
		System.out.println("The prime numbers in the range between "+startRange+" and "+endRange+" are: ");
		for(int index = startRange; index<=endRange; index++) {
			printIfNumberIsPrime(index);
		}
	}
	
	void printCountOfPrimeNumbersInaGivenRange() {
		System.out.println("The count of prime numbers is: " +countOfPrime);
	}	

	void printSumofPrimeNumbersInRange() {
		System.out.println("The sum of prime numbers is: " +sumOfPrime);
	}
	

	void printAvgofPrimeNumbersInRange() {
		double avgPrime = sumOfPrime / countOfPrime;
		System.out.println("The average of Prime numers is the given range is: " +avgPrime);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_10 obj = new Assignment_10();
		//obj.printIfNumberIsPrime(13);
		obj.printPrimeNumbersInaGivenRange(100, 120);
		obj.printCountOfPrimeNumbersInaGivenRange();
		obj.printSumofPrimeNumbersInRange();
		obj.printAvgofPrimeNumbersInRange();
	}

}
