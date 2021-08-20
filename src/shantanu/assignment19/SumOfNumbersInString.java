package shantanu.assignment19;

public class SumOfNumbersInString {
	
	int splitString(String str) {
		int sum = 0;
		String[] arr = str.split(" ");
		for(int index = 0; index < arr.length; index++) {
			sum = sum + Integer.parseInt(arr[index]);
		}
		return sum;
	}
	void displaySumOfNumbers(String str) {
		System.out.println("Sum of numbers in string is: "+splitString(str));
	}
	public static void main(String[] args) {
		SumOfNumbersInString sumOfNumbersInString = new SumOfNumbersInString();
		String input = "10 10 20 30";
		sumOfNumbersInString.displaySumOfNumbers(input);
	}
}
