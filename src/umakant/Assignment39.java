/*
 * fibonacci series
 * 0,1,1,2,3,5,8,13,21
 */
package umakant;

import java.util.Arrays;

public class Assignment39 {

	int[] getFibonacciSeries(int number) {
		int[] series = new int[number];
		series[0] = 0;
		series[1] = 1;
		for (int index = 2; index < number; index++) {
			series[index] = series[index - 1] + series[index - 2];
		}
		return series;
	}

	void showFibonacciSeries(int number) {
		int number1 = 0;
		int number2 = 1;
		System.out.print(number1 + " ");
		System.out.print(number2 + " ");
		for (int index = 2; index < number; index++) {
			int sum = number1 + number2;
			System.out.print(sum + " ");
			number1 = number2;
			number2 = sum;
		}
	}

	public static void main(String[] args) {
		Assignment39 assignment = new Assignment39();
		System.out.println(Arrays.toString(assignment.getFibonacciSeries(10)));
		assignment.showFibonacciSeries(15);
	}

}
