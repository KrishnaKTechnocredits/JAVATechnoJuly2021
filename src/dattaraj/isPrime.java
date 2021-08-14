package dattaraj;

public class isPrime {
	static int sumPrimeNo;
	static int countPrimeNo;

	void verifyNumberIsPrime(int number) {
		boolean status=true;
		for(int index=2;index<number;index++) {
			if(number%index==0) {
				status = false;
				break;	
			}
		}		
		if(status) {
			System.out.println(number+" is prime number");
			countPrimeNo++;
			sumPrimeNo=sumPrimeNo+number;
		}
	}

	void primeNumbersInRange(int startNum,int endNum) {
		for(int num=startNum;num<=endNum;num++) {
		verifyNumberIsPrime(num);
		}
		countOfPrimeNumbers();
		sumOfPrimeNumbers();
		averageOfPrimeNumbers();
	}

	void countOfPrimeNumbers() {
		System.out.println();
		System.out.println("Count of Prime Numbers:");
		System.out.println(countPrimeNo);
		System.out.println();
	}

	void sumOfPrimeNumbers() {
		System.out.println("Sum of Prime Numbers:");
		System.out.println(sumPrimeNo);
		System.out.println();
	}

	void averageOfPrimeNumbers() {
		System.out.println("Average of Numbers in range is: ");
		System.out.println(sumPrimeNo/countPrimeNo);

	}

	public static void main(String[] args) {
		isPrime prime=new isPrime();
		prime.verifyNumberIsPrime(17);
		prime.primeNumbersInRange(100, 220);

	}
}
