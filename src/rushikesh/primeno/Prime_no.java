package rushikesh.primeno;

public class Prime_no {
	static int sumPrimeNo;
	static int countPrimeNo;
	
	void verifyNumberIsPrime(int num) {
		boolean status=true;
		for(int index=2;index<num;index++) {
			if(num%index==0) {
				status = false;
				//System.out.println(num +" is not a prime number");
				break;	
			}
		}
		
		if(status) {
			System.out.println(num+" is prime number");
			countPrimeNo++;
			
			sumPrimeNo=sumPrimeNo+num;
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
		System.out.println("-----------------");
		System.out.println("Count of Prime Numbers:");
		System.out.println(countPrimeNo);
		System.out.println("-----------------");
	}
	
	void sumOfPrimeNumbers() {
		System.out.println("Sum of Prime Numbers:");
		System.out.println(sumPrimeNo);
		System.out.println("-----------------");
	}
	
	void averageOfPrimeNumbers() {
		System.out.println("Average of Numbers in range is: ");
		System.out.println(sumPrimeNo/countPrimeNo);
		
	}
	
	public static void main(String[] args) {
		Prime_no prime_no=new Prime_no();
		prime_no.verifyNumberIsPrime(11);
		System.out.println("-----------------");
		countPrimeNo=0;
		sumPrimeNo=0;
		prime_no.primeNumbersInRange(100, 120);
		
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	


