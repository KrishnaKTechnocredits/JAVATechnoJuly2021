/**
Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13 
*/
package neha;

import java.util.Arrays;

public class FibonacciSeriesAssignment39 {
	void printNelementsFibonacciSeries(int count) {
		int sum = 0;
		int num1 = 0;
		int num2 = 1;
		int[] fSeries = new int[count];
		fSeries[1] = 1;
		for (int i = 2; i < count; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			fSeries[i] = sum;
		}
		System.out.println("First " + count + " elements of Fibonacci series are: " + Arrays.toString(fSeries));
	}

	public static void main(String[] args) {
		FibonacciSeriesAssignment39 fibonacciSeries = new FibonacciSeriesAssignment39();
		int nElements = 8;
		fibonacciSeries.printNelementsFibonacciSeries(nElements);
	}
}
