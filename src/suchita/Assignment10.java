package suchita;

class Assignment10 {
	static int count =0;
	static int sum=0;
	float avg=0;
	
	
	void verifyNumberIsPrime(int number) {
	boolean status = true;
		
		for(int index=2;index<number;index++) {
			if(number % index == 0) {
				status =false ;
				
				//System.out.println(number + " is not a prime number ");
				break;
			}
		}
		if(status){
			System.out.println(number + " is prime");
			count++;
			sum = sum + number;
		}
	}
	
	void verifyPrimeNumberInRange(int startNumber,int endEndNumber) {
		for(int number = startNumber;number<=endEndNumber;number++) {
			verifyNumberIsPrime(number);
			
			
		}
	}
	
	void printPrimeNumberCount() {
		
		System.out.println("\n Total number of prime number :: " + count);
		System.out.println("\n Sum of prime numbers :: " + sum);
		avg = sum/count;
		System.out.println("\n Average of given prime numbers :: " + avg);
	}
	
	public static void main(String[] args) {
		Assignment10 assignment = new Assignment10();
		assignment.verifyNumberIsPrime(11);
		count=0;
		sum=0;
		System.out.println(".................. \n");
		assignment.verifyPrimeNumberInRange(100,120);
		assignment.printPrimeNumberCount();
	}
}