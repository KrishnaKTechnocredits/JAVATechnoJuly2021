package monika;

public class Assignment_10 {
	
static int count=0;
static int sum=0;
static float average=0;
	void verifyNumberisPrime(int number)
	{
		boolean flag=true;
		for(int index=2;index<number;index++) {
			if(number%index==0) {
				flag=false;
				break;
			}		
		}
		if(flag) {
			System.out.println(number+" is Prime Number");
			count=count+1;
			sum=sum+number;
			average=sum/count;
		}
	}
	void verifyPrimeNumberInRange(int startNumber,int endNumber) {

	
		System.out.println("-----Prime Number Between Range------");
		for(int number=startNumber;number<=endNumber;number++) 
			verifyNumberisPrime(number);
		
		
	}
	void countofPrimeNumber() {
		System.out.println("Count of Prime Number is:"+count);
	}
	void sumofPrimeNumber() {
		System.out.println("Sum of Prime Number is:"+sum);
	}
	void averageofPrimeNumber() {
		
		System.out.println("Average of the prime numbers between the given range is " +average);
	}
	
	public static void main(String[] args) {
		Assignment_10 assignment_10=new Assignment_10();
		assignment_10.verifyNumberisPrime(7);
		count=0;
		sum=0;
		average=0;
		assignment_10.verifyPrimeNumberInRange(100,120);
		assignment_10.countofPrimeNumber();
		assignment_10.sumofPrimeNumber();
		assignment_10.averageofPrimeNumber();
		
	}
}
