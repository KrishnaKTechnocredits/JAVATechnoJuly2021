package shyam;

public class Shyam_Assignment_10 {
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
		Shyam_Assignment_10 shyamAssignment10 = new Shyam_Assignment_10();
		shyamAssignment10.verifyPrimeNumberInRange(100,120);
		shyamAssignment10.processSum();
		shyamAssignment10.processAverage();
		shyamAssignment10.verifyNumberIsPrime(199);
	}
}