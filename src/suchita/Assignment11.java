package suchita;

class Assignment11 {
	
	int primeCount = 0;
	
	void checkPrime(int number) {
		boolean status = true;
		//int primeCount = 0;
		int index = 2;
		while(index < number) {
			if(number % index ==0) {
				status = false;
			}
			index++;
		}
		if(status){
			primeCount++;
			System.out.println(index);
		}
	}
	
	void firstNPrimeNumbers(int count) {
		
		int primeNumber = 2;
		while(primeCount <= count) {
			checkPrime(primeNumber);
			primeNumber++;
		}
		
	}
	
	void sumOfNumbers(int number) {
		int numCount = 0;
		int num =1;
		int sum = 0;
		while(sum <= number) {
			sum = sum + num;
			num++;
			numCount++;
		}
		System.out.println("\n " +numCount +"  numbers are required to generate sum of "+ number );
		
	}
	
	public static void main(String[] args) {
		Assignment11 assignment = new Assignment11();
		System.out.println("First N prime numbers :: \n");
		assignment.firstNPrimeNumbers(10);
		assignment.sumOfNumbers(100);
	}
}