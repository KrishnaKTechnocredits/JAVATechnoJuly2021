package sayli_Vyavhare;

public class FibonacciSeries_assign_39 {

	void getFibonacciSeries(int num) {

		int num1 = 0, num2 = 1;
		int sum = 0;
		System.out.print("First " +num + " fibonacci series is : "+ num1 + " " + num2 + " ");

		for (int index = 1; index <= num - 2; index++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + " ");
		}
	}

	public static void main(String[] args) {

		FibonacciSeries_assign_39 fibo = new FibonacciSeries_assign_39();
		fibo.getFibonacciSeries(7);
	}

}
