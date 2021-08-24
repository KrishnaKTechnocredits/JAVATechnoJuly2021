package shalaka.StringArray;

public class SumOfNumbers_Assignment19 {

	int getSumOfNumbers(String input) {
		int sum = 0;
		String arr[] = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			sum += Integer.parseInt(arr[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		String input = "10 10 20 30";
		SumOfNumbers_Assignment19 sumOfNumbers_Assignment19 = new SumOfNumbers_Assignment19();
		int outputSum = sumOfNumbers_Assignment19.getSumOfNumbers(input);
		System.out.println("Sum of the number is: " + outputSum);
	}

}
