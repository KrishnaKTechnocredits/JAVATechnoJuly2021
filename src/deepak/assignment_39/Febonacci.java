/*Assignment-39 : 25th Sep'2021
Print first N elements of the Fibonacci series. 
n -> 8
output : 0,1,1,2,3,5,8,13
	*/
package deepak.assignment_39;

public class Febonacci {

	void getFebonacci(int n) {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.print("Febonacci Series, first " + n + " numbers: ");
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");

		for (int index = 0; index < n - 2; index++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + " ");
		}

	}

	public static void main(String[] args) {
		Febonacci obj = new Febonacci();
		obj.getFebonacci(8);

	}

}
