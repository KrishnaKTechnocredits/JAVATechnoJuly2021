/* Assignment - 11 : 13th Aug'2021
While loop
Program 1:
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 10 pass as parameter, method should print first 10 prime numbers.
Program 2:
Write a method to find out required numbers to generate sum more than 100.
output : 14
*/

package akanksha_Jain;

public class Assignment_11 {
	int sum, reqSum, primeNumberCount;
	
	void findPrimeNumber(int number) {
			boolean status = true;
			int index=2;
			while(index<number) {
				if (number%index == 0) {
					status = false;
					break;
				}
				index ++;
			}
			if (status) {
				System.out.println(number + " is a prime number");
				primeNumberCount ++;
			}
	}
	
	void printNPrimeNumbers(int range) {
		int index=1;
		while (primeNumberCount<range) {
			findPrimeNumber(index);
			index ++;
		}
	}
	
	void generateSum(int number) {
		int index=1;
		while(sum<=number) {
			sum = sum + index;
			index ++;
			reqSum ++;
		}
		System.out.println("The required numbers to generate the sum more than " + number + " are: " + reqSum);
	}
	
	public static void main(String[] args) {
		Assignment_11 assignment_11 = new Assignment_11();
		assignment_11.printNPrimeNumbers(10);
		assignment_11.generateSum(100);
	}
}
