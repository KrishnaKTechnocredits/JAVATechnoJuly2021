//Assignment 11;

package parthav;

public class WhileLoop {
	int countPrimeNumbers;
	int sum = 0;
	int indexCount;
	
	void checkPrimeNumber(int number) {
		int count = 2;
		boolean primeStatus = true;
		
		while (count < number) {
			if (number % count == 0) {
				primeStatus = false;
				break;
			}
			count++;
		}
			
		if (primeStatus == true) {
			System.out.println(number);
			countPrimeNumbers++;
			}
			
		}
		
	
	void printPrimeNumbers (int number) {
		System.out.println("The first " + number + " prime numbers are: ");
		int index = 1;
		while (countPrimeNumbers < number) {
			checkPrimeNumber(index);
			index++;
		}
	}
	
	void printNumbersWithRequiredSum(int number) {
		int index = 1;
		while (number >= sum) {
			sum +=index;
			index++;
			indexCount++;
		}
		
		System.out.println("The total numbers required to generate sum of more than " + number + " are: " + indexCount);
	}
	public static void main(String [] args) {
		WhileLoop whileLoop1 = new WhileLoop();
		whileLoop1.printPrimeNumbers(10);
		WhileLoop whileLoop2 = new WhileLoop();
		whileLoop2.printPrimeNumbers(20);
		WhileLoop whileLoop3 = new WhileLoop();
		whileLoop3.printNumbersWithRequiredSum(100);
		whileLoop1.printNumbersWithRequiredSum(200);
	}

}
