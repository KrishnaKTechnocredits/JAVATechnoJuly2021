package madhavi;

public class Assignment_31_1 {

	static boolean getPerfectNo(int number) {
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
		System.out.println(".....Find perfect numbers between 40 and 170.......");
		for (int number = 40; number <= 170; number++) {
			if (getPerfectNo(number)) {
				System.out.println(number + " is a perfect number");
			}
		}

	}
}
