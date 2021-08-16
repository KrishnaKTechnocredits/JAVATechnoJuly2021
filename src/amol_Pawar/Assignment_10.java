package amol_Pawar;

public class Assignment_10 {
	int sumPrimeNum = 0;
	int count = 0;

	void verifyPrimeNumber(int num) {

		boolean flag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				flag = false;
				// System.out.println(num + " is not prime number");
				break;
			}
		}
		if (flag) {
			System.out.println(num + " is prime number");
			sumPrimeNum = sumPrimeNum + num;
			count++;
		}
	}

	void getAllPrimeNumbers(int startIndex, int lastIndex) {
		for (int index = startIndex; index <= lastIndex; index++) {
			verifyPrimeNumber(index);
		}
	}

	void getTotalPrimeNumCount() {
		System.out.println("Total prime numbers are : " + count);
	}

	void getSumOfPrimeNum() {
		System.out.println("Sum of all prime numbers is : " + sumPrimeNum);
	}

	public static void main(String[] args) {

		Assignment_10 assignment_10 = new Assignment_10();
		assignment_10.getAllPrimeNumbers(100, 120);
		assignment_10.getTotalPrimeNumCount();
		assignment_10.getSumOfPrimeNum();
	}

}
/*
 * Create a class to satisfy below requirements. a) Print Number is prime if
 * Given number is prime. (parameterized method) b) Print all the prime numbers
 * between range 100->120. (parameterized method) c) Print total count of prime
 * numbers between 100->120. d) Find sum of all prime numbers between 100->120
 * e) Find avg of prime numbers between 100->120
 */