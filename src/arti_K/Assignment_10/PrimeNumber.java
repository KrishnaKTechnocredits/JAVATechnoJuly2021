package arti_K.Assignment_10;

public class PrimeNumber {
	int count;
	int sum;
	double avg;
	
	void verifyPrimeNumber(int num) {

		boolean status = true;

		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				status = false;
			//	System.out.println(num+" is Not Prime Number");
				break;
			}
		}
		if(status) {
			System.out.println("\n"+num + " is Prime Number");
			count++;
			sum = sum + num;
			avg = sum/count;
		}
	}

	void rangeNum(int startNum, int endNum) {
		System.out.println("\nPrime Numbers between 100 and 120");
		for (int index = startNum; index <=endNum; index++) {
			verifyPrimeNumber(index);
		}
	}
	
	void countOfprimeNum() {
		System.out.println("\nCount of Prime Numbers from 100 to 120 : "+count);
	}
	
	void sumOfPrimeNum() {
		System.out.println("\nSum of Prime Numbers from 100 to 120 : "+sum);
	}
	
	void avgOfPrimeNum() {
		System.out.println("\nAverage of Prime Numbers from 100 to 120 : "+avg);
	}

	public static void main(String[] args) {
		PrimeNumber primenum = new PrimeNumber();
		primenum.verifyPrimeNumber(12);
		primenum.rangeNum(100, 120);
		primenum.countOfprimeNum();
		primenum.sumOfPrimeNum();
		primenum.avgOfPrimeNum();
		System.out.println("\nEnd");
	}
}

