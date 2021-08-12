package ritabrata;

public class Assignment10 {
	double primeSum;
	double countPrime;
	void checkPrimeNo(int number) {
		boolean status= true;
		for(int index=2; index<number; index++) {
			if(number % index==0) {
				status=false;
				break;
			}
		}
		if(status == true) {
			System.out.println("*****The number "+number+" is a prime number*****");
		}
		
	}
	void primeNoInRange(int fromNo, int toNo) {
		for(int number= fromNo; number<=toNo; number++) {
			//checkPrimeNo(number);
			boolean status= true;
			for(int index=2; index<number; index++) {
				if(number % index==0) {
					status=false;
					break;
				}
			}
			if(status == true) {
				System.out.println("The number "+number+" is a prime number in the range of "+fromNo+ " to "+ toNo);
				countPrime++;
				primeSum= primeSum+number;
			}
		}
		System.out.println("Total prime no present in range: "+countPrime);
	}
	
	void sumOfPrime() {
		System.out.println("The sum of prime numbers in the mentioned range= "+primeSum);
	}
	
	void avgOfPrime() {
		double avg= primeSum/countPrime;
		System.out.println("The Avarage of sums in the range is: "+avg);
		
	}
	public static void main(String[] args) {
		Assignment10 primeNo= new Assignment10();
		primeNo.checkPrimeNo(101);
		primeNo.primeNoInRange(100, 120);
		primeNo.sumOfPrime();
		primeNo.avgOfPrime();
	}
}
