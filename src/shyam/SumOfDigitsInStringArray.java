/*WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52
Hint: 6+9+16+4+17 = 52*/

package shyam;

public class SumOfDigitsInStringArray {
	
	public static void main(String[] args) {
		
	String[] input = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
	SumOfDigitsInStringArray sum = new SumOfDigitsInStringArray();
	
	System.out.println(
			"Total sum of all digits in a given String Array is :- " + sum.sumOfDigitsInArray(input));
}

// method to return sum of numbers in a given String
int sumOfDigitsInString(String inputString) {
	int sumOfDigits = 0;
	for (int index = 0; index < inputString.length(); index++) {
		if (Character.isDigit(inputString.charAt(index))) {
			sumOfDigits += Character.getNumericValue(inputString.charAt(index));
		}
	}
	return sumOfDigits;
}

// method to return sum of digits in given Array
int sumOfDigitsInArray(String[] arrayInput) {
	int totalSum = 0;
	for (int index = 0; index < arrayInput.length; index++) {
		totalSum += sumOfDigitsInString(arrayInput[index]);
	}
	return totalSum;
	}

}
