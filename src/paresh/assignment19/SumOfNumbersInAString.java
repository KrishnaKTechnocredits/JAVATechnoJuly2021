package paresh.assignment19;

/*program 4: sum of all numbers in given statement.
input = "10 10 20 30";
output : 70*/

public class SumOfNumbersInAString {
	public static void main(String[] args) {
		int sum = 0;
		String input = "10 20 30 40";
		String[] output = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			sum = sum + Integer.parseInt(output[index]);
		}
		System.out.println("Sum of all numbers in a String " + sum);
	}
}