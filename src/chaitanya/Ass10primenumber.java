package chaitanya;

public class Ass10primenumber {
	
	static int primeSum = 0;
	static float primeAvg ;
	static int count = 0;
	
	void verifyIfNumberisPrime(int number) {
		boolean status = false;
		for(int index=2;index<number; index++) {
			if(number%index==0) {
				status = true;
				//System.out.println(number + " is not a prime ");
		        break;
			}
		}
			if(status==false) {
				System.out.println(number + " is  a prime number ");
				primeSum += number;
				count++;
				primeAvg = primeSum/count;
			   }
		}
	
	void verifyPrimeNumberinRange(int sindex, int eindex) {
		for (int number=sindex ; number<=eindex ; number++) {
			verifyIfNumberisPrime(number);
		}
	}
	
	void countofPrime() {
		System.out.println("Count of prime numbers is " + count);
	}
	
	void displayPrimeSum(){
		System.out.println("Sum of prime numbers is " + primeSum);
	}

	void displayPrimeAverage(){
		System.out.println("Average of prime numbers is " + primeAvg);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass10primenumber ass10primenumber = new Ass10primenumber();
		ass10primenumber.verifyIfNumberisPrime(5);
		System.out.println("-------------------");
		primeSum = 0;
		primeAvg = 0;
		count = 0;
		ass10primenumber.verifyPrimeNumberinRange(100,120);
		System.out.println("-------------------");
		ass10primenumber.countofPrime();
		System.out.println("-------------------");
		ass10primenumber.displayPrimeSum();
		System.out.println("-------------------");
		ass10primenumber.displayPrimeAverage();
	}

}
