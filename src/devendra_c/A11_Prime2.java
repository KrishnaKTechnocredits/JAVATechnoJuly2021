package devendra_c;

public class A11_Prime2 {
	int countPrime = 0;

	void prime(int num) {
		boolean status = true;
		int index = 2;
		while (index < num) {
			if (num % index == 0) {
				status = false;
			}
			index++;
		}
		if (status) {
			countPrime++;
			System.out.println(" " +index);
			
		}
	}

	void primeNumbers(int count) {
		System.out.println("First "+count+" Prime Numbers :");
		int number = 2;
		while (countPrime < count) {
			prime(number);
			number++;
		}
	}

	void sumofall(int number) {
		int sum = 0;
		int index = 1;
		int count=0;
		while (sum < number) {
			sum += index;
			index++;
			count++;
		}
		System.out.println(count + " Numbers are required for Sum of " + number);
	}

	public static void main(String[] args) {
		A11_Prime2 a11 = new A11_Prime2();
		a11.primeNumbers(10);
		System.out.println("----------");
		a11.sumofall(100);
	}

}
