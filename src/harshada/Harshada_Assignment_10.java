package harshada;

public class Harshada_Assignment_10 {
	int count;
	int sum;
	int avg;
	
	void verifyNumberIsPrime(int number) {
		boolean status=true;
		for(int index=2; index<number; index++)  {
			if (number % index==0)  {
				status=false; 
				break;
			}
		}
		if (status) {
			System.out.println(number + " Is Prime");
			count++;
			sum=sum+number;
		}
	}
	
	void processSum() {
		System.out.println("Sum of above Prime numbers is="+sum );
	}
	
	void processAverage() {
		avg=sum/count;
		System.out.println("Average of above Prime numbers is="+avg );
	}
	
	void verifyPrimeNumberInRange(int startNumber, int endNumber) {
		for(int number = startNumber; number<=endNumber; number++) {
			verifyNumberIsPrime(number);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harshada_Assignment_10 harshadaAssignment1 = new Harshada_Assignment_10();
		System.out.println("\n***Identification of prime numbers between range 100 to 120***");
		harshadaAssignment1.verifyPrimeNumberInRange(100,120);
		harshadaAssignment1.processSum();
		harshadaAssignment1.processAverage();
		System.out.println("\n***Checking Particular Number is prime or not***");
		harshadaAssignment1.verifyNumberIsPrime(5);
		
	}

}
