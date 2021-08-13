package shraddha;

public class PrimeNumber {
	int totalCount;
	int sumOfNumbers;
	int averageOfNumbers;
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.verifyPrimeNumber(15, false);
		primeNumber.verifyPrimeNumber(5, false);
		primeNumber.verifyPrimeNumber(2, false);
		primeNumber.verifyPrimeNumber(1, false);
		primeNumber.verifyPrimeNumber(11, false);
		primeNumber.primeNumberInRange(100, 120,true);
	}
	
	void verifyPrimeNumber(int number,boolean printList) {
		boolean  isPrime = true;
		for(int index = 2;index < number;index++) {
			if(number % index == 0) {
				isPrime = false;
				if(!printList)
					System.out.println(number+" is NOT a prime number");
				break;
			}
			
		}
		if(isPrime) {
			if(printList)
				System.out.println(number);
			else 
				System.out.println(number+" is a prime number");
			
				totalCount = totalCount+1;
			    sumOfNumbers = sumOfNumbers + number;
			
		}
	}
		
	void primeNumberInRange(int startIndex, int endIndex, boolean printList) {
		if(printList) {
			System.out.println("------------------------------------------");
			System.out.println("Prime numbers between "+startIndex+" and "+endIndex+" are:-");
		}
		totalCount = 0;
		sumOfNumbers=0;
		for(int index=startIndex; index <= endIndex; index++) {
			verifyPrimeNumber(index,printList);
		}
		System.out.println("------------------------------------------");
		System.out.println("Total Count of Prime numbers between "+startIndex+" and "+endIndex+" is: "+totalCount);
		System.out.println("------------------------------------------");
		System.out.println("Sum of Prime numbers between "+startIndex+" and "+endIndex+" is: "+sumOfNumbers);
		System.out.println("------------------------------------------");
		averageOfNumbers = sumOfNumbers/totalCount;
		System.out.println("------------------------------------------");
		System.out.println("Average of Prime numbers between "+startIndex+" and "+endIndex+" is: "+averageOfNumbers);
		System.out.println("------------------------------------------");
	}
	
}
