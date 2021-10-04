package manaswi;

public class Assignment_39 {

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
		Assignment_39 fibonacci_Series = new Assignment_39();
		fibonacci_Series.fibonacciSeriesInGivenRange(1, 10);
	}
}