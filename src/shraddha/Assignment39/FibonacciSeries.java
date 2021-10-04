/*
Assignment-39 : 25th Sep'2021

Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13 */
package shraddha.Assignment39;

public class FibonacciSeries {
	public static void main(String[] args) {
		FibonacciSeries fb = new FibonacciSeries();
		fb.displayFibonacci(8);
	}
	
	void displayFibonacci(int n) {
		int num1 =0;
		 int num2 =1;
		 System.out.print(num1);
		 System.out.print(" , "+num2);
		 int sum =0;
		 for(int index = 0; index < n-2; index++) {
			 sum = num1 + num2;
			 System.out.print(" , "+sum);
			 num1 = num2;
			 num2 = sum;
		 }
	}
}
