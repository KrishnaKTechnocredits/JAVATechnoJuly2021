package sourabh;

public class FindPrimeNo {
	int count;
	static int sum;
	boolean status;
	
	void findPrimeNumber(int number) {
		status = true;
		for(int index = 2; index <= number-1; index++) {
			if(number%index == 0) {
				status = false;
				break;	
			}
		}
		if(status) {
			System.out.println(number + " is prime number");
			count++;
			sum = sum + number;
		}	
		
	}
	
	void findPrimeNumberInRange(int startNumber, int endNumber) {
		for(int number=startNumber; number<= endNumber; number++) {
			findPrimeNumber(number);	
		}
	}
	
	void countPrimeNumbers() {
		System.out.println("Total no. of Prime numbers from given range = " + count);
	}
	
	void sumOfPrimeNumbers() {
		System.out.println("Sum of Prime Numbers from given range = " + sum);
	}
	
	void avgOfPrimeNumbers() {
		float avg;
		avg = sum/count;
		System.out.println("Avg. of Prime Numbers from given range = " + avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPrimeNo findPrimeNum = new FindPrimeNo();
		findPrimeNum.findPrimeNumberInRange(100, 120);
		findPrimeNum.countPrimeNumbers();
		findPrimeNum.sumOfPrimeNumbers();
		findPrimeNum.avgOfPrimeNumbers();
		
	}

}
