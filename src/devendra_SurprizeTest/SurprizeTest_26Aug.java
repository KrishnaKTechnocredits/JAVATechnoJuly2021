/* Surprise coding test : 26th Aug 2021

WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52

Hint: 6+9+16+4+17 = 52

And I am going to review your code after the session time.
Do not disappoint me.

Timing : 7:45 am to 8:30 am
ALL THE BEST */

package devendra_SurprizeTest;

public class SurprizeTest_26Aug {
	int getDigitSum(String input) {
		int sum = 0;
		for(int index = 0; index < input.length(); index++) {
			if(Character.isDigit(input.charAt(index)))
				sum += Character.getNumericValue(input.charAt(index));
			}
		System.out.print(sum+ ", ");
		return sum;
	}

	int getDigitSumInArray(String[] input) {
		int totalSum =0;
		for(int index=0; index<input.length; index++)
			totalSum += getDigitSum(input[index]);
		return totalSum;
	}

	public static void main(String[] args) {
		SurprizeTest_26Aug digitsum = new SurprizeTest_26Aug();
		String[] inputArray = { "t2e4c" , "2h7no" , "3h6h2h5" , "1mk3" , "k9g8" };
		System.out.print("Total Digits = ");
		System.out.println("\nThe Total Sum Of All Digits = "+digitsum.getDigitSumInArray(inputArray));
	}
}