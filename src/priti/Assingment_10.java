package priti;
class Assingment_10 {
	int primrNumCnt;
	int sumOfPrimeNum;
	void findPrimeNum(int number) {
		boolean status = true;
		for(int index=2;index<number;index++) {
			if (number%index==0) {
				status= false;
				//System.out.println(number+" number is not a prime number");
				break;
			}
		}if (status) {		
			System.out.println(number+" number is a prime number");
			System.out.println("---------------------------------------------------------------");
			primrNumCnt++;
			sumOfPrimeNum = sumOfPrimeNum+number;
		}
	}
	
	void printPrimeNumInRange(int startNum, int endNum) {
		System.out.println("Prime number between 100 to 120:");
		System.out.println("---------------------------------------------------------------");
		for (int number=startNum; number<=endNum; number++) {
			findPrimeNum(number);
		}
		System.out.println("Count of prime number between 100 to 120 is- "+primrNumCnt);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Sum of Prime number between 100 to 120 is - "+ sumOfPrimeNum);
		System.out.println("-------------------------------------------------------------------");
	}
	
	void avgOfPrimeNum() {
		int avg= sumOfPrimeNum/primrNumCnt;		
		System.out.println("Average of Prime number between 100 to 120 is - "+ avg);
		System.out.println("-------------------------------------------------------------------");
	}
	
	public static void main(String[] a) {
		Assingment_10 assingment_10 = new Assingment_10();
		assingment_10.printPrimeNumInRange(100,120);
		assingment_10.avgOfPrimeNum();
	}   
}
