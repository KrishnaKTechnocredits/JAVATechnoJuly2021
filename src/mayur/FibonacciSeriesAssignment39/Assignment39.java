/*Assignment-39 : 25th Sep'2021

Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13 */

package mayur.FibonacciSeriesAssignment39;

public class Assignment39 {
	
	void fibonaciiSeries(int number) {
		int num = 0;
		int num1 = 1;
		int sum;
		System.out.println("first "+number+" elements of the Fibonacci series is : ");
		System.out.print(num + " ");
		System.out.print(num1 + " ");
		for (int index=1; index<=number-2; index++) {
			sum = num + num1 ;
			System.out.print(sum+" ");
			num = num1;
			num1 = sum;
		}
	}
	public static void main(String[] args) {
		Assignment39 assignment39 = new Assignment39();
		assignment39.fibonaciiSeries(8);
	}
}
