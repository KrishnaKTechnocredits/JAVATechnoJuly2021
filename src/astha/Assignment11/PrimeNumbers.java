package astha.Assignment11;

public class PrimeNumbers {
	
	int count;
	boolean isPrime= true;
	void checkPrimeNumber(int number) {
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
		while (count <= endIndex) {
			checkPrimeNumber(number);
			if(isPrime) {
				System.out.print(number+" ");
				count++;
			}
			number++;
		}
	}
	
	void sumMoreThanHundered(int number) {
		int index = 1;
		int counter = 0;
		int sum = 0;
		while(sum <= number) {
			sum += index;
			counter++;
			index++;
		}
		System.out.println("The count of numbers that generate a sum of "+number+" is : "+counter);
	}
	
	public static void main(String[] args) {
		PrimeNumbers primeNumber = new PrimeNumbers();
		primeNumber.printPrimeNumbers(10);
		System.out.println("\n");
		primeNumber.sumMoreThanHundered(20);
	}
}
