/*
 * Assignment-39 : 25th Sep'2021

Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13 
 */
package husain.Assignment39;

public class Fibonacci {

	void findFibonacci(int num) {

		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		int index = 1;

		while (index <= num) {
			System.out.print(num1 + " ");
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			index++;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibonacci fibo = new Fibonacci();
		System.out.println("The Fibonacci series for the value 8 is ");
		fibo.findFibonacci(8);

	}

}
