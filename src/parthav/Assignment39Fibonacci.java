/*Assignment-39 : 25th Sep'2021

Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13 */
package parthav;

public class Assignment39Fibonacci {
	
	void printFibonacci(int number) {

		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.println(num1);
		System.out.println(num2);

		for (int index = 1; index <= number - 2; index++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.println(sum);

		}
	}

	public static void main(String[] args) {
		Assignment39Fibonacci newObj = new Assignment39Fibonacci();
		System.out.println("----------------First 5 Fibonacci numbers---------------------");
		newObj.printFibonacci(5);
		System.out.println("----------------First 8 Fibonacci numbers---------------------");
		newObj.printFibonacci(8);

	}

}
