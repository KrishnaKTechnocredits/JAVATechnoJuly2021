/* While loop

Program 1 : 
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 10 pass as parameter, method should print first 10 prime numbers.

Program 2 : 
Write a method to find out required numbers to generate sum more than 100.
output : 14
 */
package umakant;

public class Assignment11 {

	boolean isPrime(int number) {
		boolean flag = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	void requiredPrimeNumbers(int requiredCount) {
		int count = 0;
		int number = 2;
		System.out.print("First " + requiredCount + " prime numbers are:");
		while (count < requiredCount) {
			if (isPrime(number)) {
				System.out.print(number + " ");
				count++;
			}
			number++;
		}
	}

	void requiredNumberToGenerateSum(int requiredSum) {
		int sum = 0;
		int number = 1;
		while (sum < requiredSum) {
			sum += number;
			number++;
		}
		System.out.println("Required number to generate the sum greater than " + requiredSum + " is:" + (number - 1));
	}

	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.requiredPrimeNumbers(10);
		System.out.println();
		assignment11.requiredNumberToGenerateSum(100);
	}

}
