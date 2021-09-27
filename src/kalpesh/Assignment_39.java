/*
 * 39 : 25th Sep'2021
 * 
 * Print first N elements of the Fibonacci series. n -> 8 output :
 * 0,1,1,2,3,5,8,13
 */

package kalpesh;

public class Assignment_39 {
	void getFibonacciSeriesNum(int num) {
		int num1;
		int num2 = 0;
		int num3 = 1;
		System.out.println("First 8 elements of the Fibonacci series are as follows");
		while (num != 0) {
			System.out.print(num2 + " ");
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
			num--;
		}
	}

	public static void main(String[] args) {
		Assignment_39 assignment_39 = new Assignment_39();
		int num = 8;
		assignment_39.getFibonacciSeriesNum(num);
	}

}
