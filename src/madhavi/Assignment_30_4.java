package madhavi;

public class Assignment_30_4 {
	void checkPerfectNumber(int number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			System.out.println(number + " is Perfect Number!");
		} else {
			System.out.println(number + " is not Perfect Number!");
		}
	}

	public static void main(String[] args) {
		Assignment_30_4 assignment_30_4 = new Assignment_30_4();
		System.out.println(".....Verify given number is a perfect number or not......");
		int num1 = 6;
		assignment_30_4.checkPerfectNumber(num1);
		int num2 = 15;
		assignment_30_4.checkPerfectNumber(num2);
	}
}
