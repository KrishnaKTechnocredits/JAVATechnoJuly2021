package chandani;

class Assignment10{

	int primeSum;
	int primeAvg;
	int count;
	
	void checkNumberPrimeOrNot(int number){
		
		boolean status = true;
		
		for (int index = 2; index<number; index++){
			if(number%2 == 0){
				status = false;
				System.out.println(number + " is not a prime number");
				break;
			}
		}
		if(status){
			System.out.println(number + " is a prime number");
			primeSum = primeSum + number;
			count = count + 1;
			primeAvg = primeSum/count;
		}
	}
	
	void verifyNumberInRange(int startIndex, int endIndex){
		for (int number = startIndex; number < endIndex; number++){
			checkNumberPrimeOrNot(number);
		}	
		
	}
	
	void displayPrimeSum(){
		System.out.println("Sum of prime numbers is " +primeSum);
	}
	
	void displayPrimeAverage(){
		System.out.println("Average of prime numbers is " +primeAvg);
	}
	
	void displayPrimeNumCount(){
		System.out.println("Count of prime numbers is " +count);
	}
	
	public static void main(String[] args){
		Assignment10 assignment10 = new Assignment10();
		assignment10.checkNumberPrimeOrNot(17);
		assignment10.verifyNumberInRange(100,120);
		assignment10.displayPrimeSum();
		assignment10.displayPrimeAverage();
		assignment10.displayPrimeNumCount();
	}
}