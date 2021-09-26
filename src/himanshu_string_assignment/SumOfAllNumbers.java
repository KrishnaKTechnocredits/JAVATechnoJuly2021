package himanshu_string_assignment;

public class SumOfAllNumbers {

	void sumOfNumbers(String input) {
		int sum = 0;
		String inputStr = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				inputStr += input.charAt(index);
			} else {
				if (!inputStr.equals("")) {
					sum += Integer.parseInt(inputStr);
					inputStr = "";
				}
			}
		}
		System.out.println("Sum of all numbers : " + sum);
	}

	public static void main(String[] args) {

		String input = "te12ch33no3credit4s";

		SumOfAllNumbers SumOfAllNumbers = new SumOfAllNumbers();
		SumOfAllNumbers.sumOfNumbers(input);
	}
}
