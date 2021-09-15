package nasir_Assignment_30;

public class PerfectNumber {
	boolean isNumberPerfect(int num) {
		int perfect = 0;
		for (int divisor = 1; divisor <= num / 2; divisor++) {
			if (num % divisor == 0)
				perfect += divisor;
		}
		if (perfect == num)
			return true;
		else
			return false;
	}

	void displayResult(int num) {
		if (isNumberPerfect(num))
			System.out.println(num + " is a perfect number!");
		else
			System.out.println(num + " is not a perfect number!");
	}

	public static void main(String[] args) {
		PerfectNumber perfectNumber = new PerfectNumber();
		perfectNumber.displayResult(28);

	}

}
