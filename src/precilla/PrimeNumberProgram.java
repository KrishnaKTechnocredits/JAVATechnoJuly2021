package precilla;

public class PrimeNumberProgram {
	int count=0;
	float sum=0.0f,average=0.0f;
	void isPrimeNumber(int number) {
		boolean isPrime=true;
		
		for(int index=2;index < number ;index++) {
			if(number%index==0) {
				isPrime=false;
			//	System.out.println(number+ " is not a Prime number ");
				break;
			}
			
		}
		if(isPrime) {
			System.out.println(number + " is a Prime Number");
			count = count+1;
			sum= sum + number;
			average= sum/2;
		}
	}
	void primeNumbersInRange(int startRange,int endRange) {
		for(int number=startRange;number<=endRange;number++) {
			isPrimeNumber(number);
		}
	}
	public static void main(String[] args) {
		PrimeNumberProgram primeNumberProgram=new PrimeNumberProgram();
		System.out.println("***Prime Numebrs in Range **");
		primeNumberProgram.primeNumbersInRange(100, 120);
		System.out.println("\nTotal count of prime numbers found in the given range : " +primeNumberProgram.count);
		System.out.println("Sum of prime numbers are : "+primeNumberProgram.sum);
		System.out.println("Average of Prime numebrs are : "+primeNumberProgram.average);
		System.out.println("\n***if given number is a Prime Number **");
		primeNumberProgram.isPrimeNumber(17);
		primeNumberProgram.isPrimeNumber(3);
	}

}
