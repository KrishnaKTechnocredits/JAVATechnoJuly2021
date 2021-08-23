/*Assignment 19 [program 4: sum of all numbers in given statement.] DATE: 08/20
input = "10 10 20 30";
output : 70*/
package deepak.Assignment_19;

public class SumOfNumbers {
	String[] getStringOfNumbers(String numbers) {
		String[] arr = null;
		for (int i = 0; i < numbers.length(); i++) {
			arr = numbers.split(" ");
		}
		return arr;
	}

	int sum(String input) {
		int sum = 0;
		String[] arr = getStringOfNumbers(input);
		for (int i = 0; i < arr.length; i++) {
			sum = sum + Integer.parseInt(arr[i]);
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfNumbers input = new SumOfNumbers();
		int sum = input.sum("10 10 20 30");
		System.out.println("Sum of all the intergers passed as string is: " + sum);
	}

}
