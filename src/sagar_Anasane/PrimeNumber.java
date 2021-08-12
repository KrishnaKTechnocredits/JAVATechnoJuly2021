package sagar_Anasane;

class PrimeNumber{
	int primeSum = 0;
	int count = 0;
	int avg = 0;
	void verifyNumberIsPrime(int num){
		boolean status = true;
		for (int index=2; index < num ;index ++){
			if (num % index == 0){
				status = false;
			break;
			}
		}
		if (status == true){
			System.out.println(num +"is a Prime Number");
			primeSum = primeSum + num;
			count = count + 1;
		}
	}
	
	void inBetweenRangePrimeNos(int startIndex , int endIndex){
		for (int num = startIndex; num <= endIndex; num++){
			verifyNumberIsPrime(num);
		}
	}
	
	void printSumOfPrimeNos(){
		System.out.println("Sum of Prime Nos ="+primeSum);
	}
	
	void printCountOfPrimeNos(){
		System.out.println("Count of Prime Nos ="+count);
	}
	
	void avgOfPrimeNos(){
		avg= primeSum/count;
		System.out.println("Average of Prime Nos ="+avg);
	}
	
	
	public static void main(String[] args){
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.inBetweenRangePrimeNos(100,120);
		primeNumber.printSumOfPrimeNos();
		primeNumber.printCountOfPrimeNos();
		primeNumber.avgOfPrimeNos();
		primeNumber.verifyNumberIsPrime(19);
	}
}