package madhavi;

public class Coding_Test_5 {
	static boolean getFirst5PerfectNo(int number) {
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
		System.out.println(".....Find first 5 perfect numbers.......");
		for (int number = 2; number < 10000; number++) {
			if (getFirst5PerfectNo(number))
				System.out.println(number + " is a perfect number");
		}
	}
}
