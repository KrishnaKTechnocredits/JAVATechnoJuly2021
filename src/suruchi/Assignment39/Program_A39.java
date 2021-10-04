package suruchi.Assignment39;

public class Program_A39 {

	void printNelementsFibonacciSeries(int count) {
		int sum = 0;
		int num1 = 0;
		int num2 = 1;
		System.out.print("First " + count + " elements in fibonacci series are: " + num1 + " ");
		System.out.print(num2 + " ");
		for (int index = 1; index <= count - 2; index++) {
			sum = num1 + num2;
			System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
		}
	}

	public static void main(String[] args) {
		Program_A39 program_a39 = new Program_A39();

		program_a39.printNelementsFibonacciSeries(8);

	}
}