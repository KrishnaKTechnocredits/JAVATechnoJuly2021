/*Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13*/

package vivek;

public class Assignment39 {

	void getFibonacciSeries(int N) {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.print(num1 + " " + num2 + " ");
		for (int index = 2; index < N; index++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + " ");
		}
	}

	public static void main(String[] args) {
		Assignment39 assignment39 = new Assignment39();
		assignment39.getFibonacciSeries(8);
	}
}
