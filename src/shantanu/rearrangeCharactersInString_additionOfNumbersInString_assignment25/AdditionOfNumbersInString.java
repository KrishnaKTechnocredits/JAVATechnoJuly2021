package shantanu.rearrangeCharactersInString_additionOfNumbersInString_assignment25;

public class AdditionOfNumbersInString {
	int getSumOfNumbersInString(String input) {
		int sum = 0;
		String sumTemp = "";
		for(int index = 0; index < input.length(); index++) {
			if(Character.isDigit(input.charAt(index))){
					sumTemp = sumTemp + String.valueOf(input.charAt(index));
					continue;
			}
			if(!sumTemp.isEmpty())
				sum += Integer.parseInt(sumTemp);
			sumTemp="";
		}
		return sum;
	}
	void displaySumOfNumbersInString(String input) {
		if(getSumOfNumbersInString(input) != 0) 
			System.out.println("Sum of numbers in a string is: "+getSumOfNumbersInString(input));
		else
			System.out.println("No numbers in the string!");
	}
	public static void main(String[] args) {
		AdditionOfNumbersInString additionOfNumbersInString = new AdditionOfNumbersInString();
		String input = "te12ch33no3credit4s";
		additionOfNumbersInString.displaySumOfNumbersInString(input);
	}
}
