package nasir;

public class FirstNPrimeNumbers {
	void checkPrimeNumber(int number) {
		int index = 1;
		int print = 2;
		int count;
		boolean status;

		System.out.println("First " + number + " prime numbers are :-");

		while (index <= number) {

			status = true;
			for (count = 2; count <= print-1; count++) {
				if (print % count == 0) {
					status = false;
					break;
				}
			}
			if (status) {
				System.out.println(print);
				index++;
			}
			print++;
		}

	}

	void generateSum() {
		int sum = 0;
		int number = 0;

		while (sum <= 100) {
			sum = sum + number;
			if (sum <= 100) {
				number++;
			}

		}
		
		System.out.println("Numbers to generate sum more than 100 :- " + "\n" + number);
	}

	public static void main(String[] args) {
		FirstNPrimeNumbers firstNPrimeNumbers = new FirstNPrimeNumbers();
		firstNPrimeNumbers.checkPrimeNumber(10);
		firstNPrimeNumbers.generateSum();
	}

}