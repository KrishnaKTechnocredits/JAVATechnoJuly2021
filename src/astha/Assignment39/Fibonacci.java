/*Assignment-39 : 25th Sep'2021

Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13 */

package astha.Assignment39;

public class Fibonacci {

	void generateFibonacciSeries(int number) {
		int num1 = 0;
		int num2 = 1;
		System.out.println("First " + number + " elements of the Fibonacci series :  ");
		System.out.print(num1 + " " + num2 + " ");
		for (int index = 0; index < number - 2; index++) {
			int sum = num1 + num2;
			System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
		}
	}

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.generateFibonacciSeries(8);
	}

}
