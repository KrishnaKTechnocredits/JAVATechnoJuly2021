package anuja;

public class PrimeNumber {
	
	int sum=0;
	int count=0;
	int avg=0;
	
	void verifyNumberIsPrime(int number) {
		int status=0;
		for(int index=2;index<number;index++) {
			if(number%index==0) {
				status=1;
				System.out.println(number + " is not a prime number");
				break;
		}
		
	} 
	if(status==0)
		System.out.println(number + " is prime");
		sum=sum+number;
		count++;
		System.out.println("Sum of prime nos is "+ sum);
		System.out.println("Count of prime nos is "+ count);
		avg=sum/count;
		System.out.println("Average of prime nos is " +avg);

	}
	
	void verifyPrimeNumberInRange(int startNumber,int endEndNumber) {
		for(int number=startNumber;number<=endEndNumber;number++) {
			verifyNumberIsPrime(number);
		}
	}
	public static void main(String[] args) {
		PrimeNumber primenumber=new PrimeNumber();
		primenumber.verifyNumberIsPrime(21);
		primenumber.verifyPrimeNumberInRange(100,120);
	}
}