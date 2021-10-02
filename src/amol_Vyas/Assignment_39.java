/*Assignment-39 : 25th Sep'2021

Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13 
*/
package amol_Vyas;

public class Assignment_39 {

	static void printFirstNElementsFromFibonacciSeries(int n) {
		int num1 = 0, num2 = 1;
		int sum = 0;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for (int index = 1; index <= n - 2; index++) {
			sum = num1 + num2;
			System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
		}
	}

	public static void main(String[] args) {
		Assignment_39.printFirstNElementsFromFibonacciSeries(8);
	}
}
