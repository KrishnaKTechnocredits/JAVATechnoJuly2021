package shweta_Dharmadhikari.PrimeNumber;

public class Assignment11 {
	int primeCount = 0;
	int number = 0;
	boolean isPrime= true;
	
	void checkPrimeNumbers(int number) {
		int index=2;
		while(index<number) {
			isPrime = true;
			if(number%index == 0) { 
				isPrime = false;				
				break;
			}
			index++;
		}
	}

	void printPrimeNumbers(int endIndex) {
		System.out.println("The first "+endIndex+" prime numbers are: ");
		int number=2;
		while (primeCount < endIndex) {
			checkPrimeNumbers(number);
			if(isPrime) {
				System.out.print("\n" +number+" ");
				primeCount++;
			}
			number++;
		}
	}
	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.printPrimeNumbers(10);
	}
}
