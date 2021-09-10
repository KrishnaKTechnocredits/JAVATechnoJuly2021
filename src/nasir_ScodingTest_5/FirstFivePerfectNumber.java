package nasir_ScodingTest_5;

public class FirstFivePerfectNumber {
	boolean firstFiveNumber(int number) {
		int sum = 1;

		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				if (i * i != number)
					sum = sum + i + number / i;
				else
					sum = sum + i;
			}
		}
		if (sum == number && number != 1)
			return true;

		return false;
	}

	public static void main(String[] args) {
		FirstFivePerfectNumber firstFivePerfectNumber= new FirstFivePerfectNumber();
		for (int number = 2; number < 10000; number++) {
			if (firstFivePerfectNumber.firstFiveNumber(number))
				System.out.println(number + " is a perfect number");
		}

	}

}
