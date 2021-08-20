//to print prime numbers between range and count of numbers to generate sum more than 100
package bhagyashree;

public class Assignment11 {

	int count = 0;

	boolean isNumberPrime(int number) {
		boolean status = true;
		int index = 2;
		while (index < number) {
			if (number % index == 0) {
				status = false;
				break;
			}
			index++;
		}
		return status;

	}

	void printFirstNPrimeNumber(int reqNumber) {
		int number = 2;
		System.out.print("First " + reqNumber + " Prime Numbers are: ");
		while (count < reqNumber) {
			if (isNumberPrime(number)) {
				System.out.print(number + " ");
				count++;
			}
			number++;
		}
	}

	void printTotalCount(int totalsum, int startnumber) {
		int sum = 0;
		int number = 0;
		while (sum <= totalsum) {
			sum = sum + startnumber;
			number++;
			startnumber++;
		}
		System.out.println("Total  " + number + " numbers required to generate sum more than " + totalsum);
	}

	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.printFirstNPrimeNumber(10);
		System.out.println();
		assignment11.printTotalCount(100, 1);

	}

}