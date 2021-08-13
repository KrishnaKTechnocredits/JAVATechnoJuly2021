package purshottamJoshi;

class PrimeNumber{
	int count;
	static int sum;
	static int average;
	void checkPrimeNumber(int number) {
	boolean status = true;
		for(int index=2; index < number; index++){
			if(number % index == 0){
				status = false;
				System.out.println(number +" is not prime number");
				break;
			}
		} 
		if(status) {
			System.out.println(number+ " is Prime Number");
			count++;
			sum = sum +number;
			average = sum/count;
		}
		
	}	
	
	void verifyPrimeNumberRange(int startNum,int endNum) {
		for(int index = startNum; index <= endNum; index++) {
			checkPrimeNumber(index);
		}
	}
	void countPrimeNumber() {
		System.out.println("Prime numbers in defined Range: " +count);
	}
	void sumOfPrimeNumber() {
		System.out.println("Sume of Prime Numbers: " +sum);
	}
	void averageOfPrimeNumbers()	{
		System.out.println("Average Of Prime Number: " +average);
	}
	
	public static void main(String[] args){
		PrimeNumber primenumber = new PrimeNumber();
		primenumber.checkPrimeNumber(17);
		primenumber.verifyPrimeNumberRange(100,120);
		primenumber.countPrimeNumber();
		primenumber.sumOfPrimeNumber();
		primenumber.averageOfPrimeNumbers();
	}
}
