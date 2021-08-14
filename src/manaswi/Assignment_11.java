package manaswi;
public class Assignment_11 
{
	int sum;
	int requiredSum;
	int count;

	void primeNumber(int number) {
		boolean status = true;
		int index = 2;
		while (index < number) {
			if (number % index == 0) {
				status = false;
				break;
			}
			index++;
		}
		if (status) {
			System.out.println(number + " is a prime number");
			count++;
		}
	}

	void displayPrimeNumbers(int range) {
		int index = 1;
		while (count < range) {
			primeNumber(index);
			index++;
		}
	}

	void Sum(int number) {
		int index = 1;
		while (sum <= number) {
			sum = sum + index;
			index++;
			requiredSum++;
		}
		System.out.println("The sum more than " + number + " are: " + requiredSum);
	}

	public static void main(String[] args) {
		Assignment_11 Assignment_11 = new Assignment_11();
		Assignment_11.displayPrimeNumbers(10);
		Assignment_11.Sum(100);
	}
}