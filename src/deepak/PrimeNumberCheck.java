// Assignment 10 [Various Prime Number Functions] DATE: 08/12/2021

package deepak;

public class PrimeNumberCheck {
	int primeNumCnt;
	int primeNumsum;
	
	
	void verifyIfPrime(int number) {
		boolean flag = true;
		for(int index = 2; index < number; index++) {
			if(number % index == 0) {
				flag = false;
				//System.out.println(number+" is not a prime number.");
				break;
			}
		}if(flag) {
			System.out.println(number+" is a prime number.");
			primeNumCnt++;
			primeNumsum=primeNumsum+number;
		}	
	}
	
	void primeNumInRange(int startNum, int endNum) {
		System.out.println("*************************************************************************");
		System.out.println("Function to print prime numbers in the range provided "+startNum+" to "+endNum);
		for(int index = startNum;index <= endNum; index++) {
			verifyIfPrime(index);
		}
		System.out.println("*************************************************************************");
	}
	
	void getPrimeNumCount(int startNum, int endNum) {
		System.out.println("Function to print count of prime numbers in the range provided "+startNum+" to "+endNum);
		for(int index = startNum;index <= endNum; index++) {
			verifyIfPrime(index);
		}
		System.out.println("Number of prime numbers in the provided range is: "+primeNumCnt);
		System.out.println("*************************************************************************");
		
	}
	
	void getPrimeNumSum(int startNum, int endNum) {
		System.out.println("Function to print sum of prime numbers in the range provided "+startNum+" to "+endNum);
		for(int index = startNum;index <= endNum; index++) {
			verifyIfPrime(index);
		}
		System.out.println("Sum of prime numbers within the range is "+primeNumsum);
		System.out.println("*************************************************************************");
	}
	
	void getPrimeNumAvg(int startNum, int endNum) {
		System.out.println("Function to print average of prime numbers in the range provided "+startNum+" to "+endNum);
		for(int index=startNum;index<=endNum;index++) {
			verifyIfPrime(index);
		}
		double avg=primeNumsum/primeNumCnt;
		
		System.out.println("Average of prime numbers within the range is "+avg);
		System.out.println("*************************************************************************");
	}
	
	
	public static void main(String[] args) {
		PrimeNumberCheck obj = new PrimeNumberCheck();
		obj.verifyIfPrime(17);
		obj.verifyIfPrime(103);
		PrimeNumberCheck obj1 = new PrimeNumberCheck();
		obj1.primeNumInRange(100, 120);
		PrimeNumberCheck obj2 = new PrimeNumberCheck();
		obj2.getPrimeNumCount(100, 120);
		PrimeNumberCheck obj3 = new PrimeNumberCheck();
		obj3.getPrimeNumSum(100, 120);
		PrimeNumberCheck obj4 = new PrimeNumberCheck();
		obj4.getPrimeNumAvg(100, 120);
	}

}
