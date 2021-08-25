package shantanu.characterClassAssignment22;

public class SumOfAllDigitsInString {
	int getSumOfAllDigitsInString(String str) {
		int sum = 0;
		for(int index = 0; index < str.length(); index++) {
			if(Character.isDigit(str.charAt(index))) 
				sum += Character.getNumericValue(str.charAt(index));
		}
		return sum;
	}
	void displaySumOfAllDigitsInString(String str) {
		System.out.println("Sum of all digits in the string is: "+getSumOfAllDigitsInString(str));
	}
	public static void main(String[] args) {
		SumOfAllDigitsInString sumOfAllDigitsInString = new SumOfAllDigitsInString();
		String str = "Te11ch2no3cr4edi2ts";
		sumOfAllDigitsInString.displaySumOfAllDigitsInString(str);
	}
}
