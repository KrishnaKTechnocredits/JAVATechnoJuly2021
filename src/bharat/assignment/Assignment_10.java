package bharat.assignment;

public class Assignment_10 {

	int primeCount = 0;
	int sumofprimenum;
	
	void primeNumber(int number) {
		boolean status = false;
		
		for(int index =2;index < number;index++) {
			if(number % index == 0) {
				System.out.println(number+"-not Prime number");
				status = true;
				break;
			}
		}
		if(!status) {
			System.out.println(number+"-prime Number");
			primeCount++;
			sumofprimenum=sumofprimenum + number;
			
		}
	}
	void numberInRange (int start, int end ) {
		for(int no = start; no <=end; no++) {
			primeNumber(no);
		}
		System.out.println("*************************************************************");
	}
	
	void countOfPrimeNumber() {
		System.out.println("Total Prime Number :-"+primeCount);
		
		System.out.println("****************************************************************");
	}
	
	void sumOfPrimeNum() {
		System.out.println("Sum of Prime Number :-"+sumofprimenum);
		
		System.out.println("***************************************************************");
		
	}

	void avarageofPrimeNumber() {
		float avg = sumofprimenum/primeCount;
		System.out.println("Avarage of prime Number is :-"+avg);
		
		System.out.println("**********************************************************");
		
	}
	
	public static void main(String[] args) {
		Assignment_10 assignment_10 = new Assignment_10();
		assignment_10.numberInRange(100, 120);
		assignment_10.countOfPrimeNumber();
		assignment_10.sumOfPrimeNum();
		assignment_10.avarageofPrimeNumber();
		
	}
}



