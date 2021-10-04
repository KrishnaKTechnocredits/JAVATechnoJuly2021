package varun.varun_different_programs;

public class Fibonacci_Series {
	
	void fibonacciSeriesInGivenRange(int startNum, int endNum) {
		int sum = 0;
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		for(int index = startNum;index<endNum;index++) {
			sum = num1+num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
		}
	}
	public static void main(String[] args) {
		Fibonacci_Series fibonacci_Series = new Fibonacci_Series();
		fibonacci_Series.fibonacciSeriesInGivenRange(1, 10);
	}
}
