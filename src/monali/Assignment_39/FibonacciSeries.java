package monali.Assignment_39;

public class FibonacciSeries {

	void getFibonacciSeries(int num) {
		int num1 = 0, num2 = 1, sum = 0;

		System.out.print(num1 + " " + num2 + " ");

		for (int i = 2; i < num; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + " ");
		}

	}

	public static void main(String[] args) {
		FibonacciSeries fb = new FibonacciSeries();
		fb.getFibonacciSeries(8);
	}
}
