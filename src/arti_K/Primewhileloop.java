/* Assignment 11 : 13th Aug'2021  Program 2 :
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 10 pass as parameter, method should print first 10 prime numbers.
*/

package arti_K;

public class Primewhileloop {

	void printPrimeNumber(int primeCount) {

		System.out.println("First 10 Prime Numbers are :");
		int count = 1;
		int number = 2;

		while (count <= primeCount) {

			boolean flag = true;
			int index = 2;

			while (index < number) {
				if (number % index == 0) {
					flag = false;
					break;
				}
				index++;
			}
			if (flag) {
				System.out.print(number + " ");
				count++;
			}
			number++;
		}
	}
	public static void main(String[] args) {

		Primewhileloop primenum = new Primewhileloop();
		primenum.printPrimeNumber(10);
	}

}
