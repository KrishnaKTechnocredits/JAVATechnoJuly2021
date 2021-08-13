package nidhi;

class Nidhi_Assignment_10 {
	int countPrime;
	int sumPrime;
	
	void primeNumFinder(int num) {
		boolean status = false;
		for (int ind = 2; ind < num; ind++ ) {
			if (num % ind == 0) {
				status = true;
				//System.out.println(num + " is not prime");
				break;
			}
		}
		if(status == false) {
			System.out.println(num + " is Prime");
			countPrime++;
			sumPrime = sumPrime + num;	
		}
			
	}
	
	void primeRange(int startNum , int endNum) {
		
		for (int ind = startNum; ind <= endNum; ind++) {
			primeNumFinder(ind);
		}
		
	}

	public static void main(String[] args) {
		Nidhi_Assignment_10 prNum = new Nidhi_Assignment_10();
		prNum.primeRange(100, 120 );
		System.out.println("Total Count of Prime Number in Range is " + prNum.countPrime);
		System.out.println("Sum of Prime Number in Range is " + prNum.sumPrime);
		System.out.println("Average of all Prime Numbers is : " + (prNum.sumPrime / prNum.countPrime));
	}

}
