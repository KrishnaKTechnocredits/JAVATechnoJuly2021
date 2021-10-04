
/*Assignment-39 : 25th Sep'2021

Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13 */
package shalaka.Assignment39;

public class FibonacciSeries {
	void printFibonacciSeries(int num) {
		int num1 = 0, num2 = 1, sum = 0;
		System.out.print("Febonacci Series of first " + num + " numbers: ");
		System.out.print(num1 + ",");
		System.out.print(num2 + ",");
		for (int index = 0; index < num - 2; index++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		int num = 8;
		fibonacciSeries.printFibonacciSeries(num);
	}

}
