/*
 * Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13

 */

package bhagyashree;

public class Assignment39 {
	int temp;

	void printFibonacciSeries(int n) {
		int sum = 0;
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1);
		System.out.print("," + n2);
		for (int index = 0; index < n - 2; index++) {
			sum = n1 + n2;
			System.out.print("," + sum);
			n1 = n2;
			n2 = sum;
		}

	}

	public static void main(String[] args) {
		Assignment39 ass39 = new Assignment39();
		System.out.println("Printing Fibonacci Series: ");
		ass39.printFibonacciSeries(9);
	}
}
