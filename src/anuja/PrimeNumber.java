package anuja;

public class PrimeNumber {
	
	int sum=0;
	int count;
	int count1=0;
	double avg=0.00;
	
	void verifyNumberIsPrime(int number) {
		boolean status=true;
		for(int index=2;index<number;index++) {
			if(number%index==0) {
				status=false;
				//System.out.println(number + " is not a prime number");
				break;
			}
		} 
		if(status==true) {
			if(count==0) {
				System.out.println(number + " is prime");
				count++;
			}
			else {
			System.out.println(number + " is prime");
			sum=sum+number;
			count1++;
			avg=sum/count1;
			}
		}
	}
	
	void display() {
		System.out.println("Sum of prime nos is "+ sum);
		System.out.println("Count of prime nos is "+ count1);
		System.out.println("Average of prime nos is " +avg);
	}
	
	void verifyPrimeNumberInRange(int startNumber,int endEndNumber) {
		for(int number=startNumber;number<=endEndNumber;number++) {
			verifyNumberIsPrime(number);
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber primenumber=new PrimeNumber();
		primenumber.verifyNumberIsPrime(19);
		primenumber.verifyPrimeNumberInRange(100,120);
		primenumber.display();
	}
}