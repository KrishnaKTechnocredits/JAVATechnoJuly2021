package devendra_c;

public class A10_PrimeNo {
	
	int totalCount;
	int primeSum;
	double average;

	void printPrimeNumber(int number) {
		//int index = 2;
		boolean status = true;
		for(int index = 2; index < number; index++) {
			if(number%index==0) {
				status = false;
				System.out.println(number+ " is not a Prime Number.");
				break;
		    }
		} if(status) {
			 System.out.println(number+ " is a Prime Number.");
			 primeSum = primeSum + number;
			 totalCount = totalCount + 1;
			 average = primeSum / totalCount;
			 }
	}

	void verifyPrimeNumInRange(int startRange, int endRange) {
		//System.out.println(" * Prime & Non-Prime Numbers");
		for(int number = startRange; number <= endRange; number++) {
			printPrimeNumber(number);
		}
	}

	void displayTotalCount() {
		 System.out.println(" * Total Count Of Prime Numbers");
		 System.out.println("Total Count is " +totalCount);
	 }

	 void displayPrimeSum() {
		 System.out.println(" * Sum Of All Prime Numbers");
		 System.out.println("Sum is " +primeSum);
	 }

	 void displayAverage() {
		 System.out.println(" * Average Of Prime Numbers");
		 System.out.println("Average is " +average); 
	 }

	 public static void main(String[] args) {
		A10_PrimeNo a10_primeno = new A10_PrimeNo();
		System.out.println(" ** Print Prime & Non-Prime Numbers, Count, Sum & Average. **");
	//	a10_primeno.printPrimeNumber(0);
		a10_primeno.verifyPrimeNumInRange(1, 10);
		a10_primeno.displayPrimeSum();
		a10_primeno.displayTotalCount();
		a10_primeno.displayAverage();
	}
}
