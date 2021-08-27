/*
 Surprise coding test : 26th Aug 2021
WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52
Hint: 6+9+16+4+17 = 52
And I am going to review your code after the session time.
Do not disappoint me.
Timing : 7:45 am to 8:30 am
All the best.
Branch name : yourName_ScodingTest_1
 * 
 */

package mayur;

public class CodingTest1 {

	int getSumOfDigitInStringArray(String[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {

			sum += getSumOfDigitInString(input[index]);
			
		}return sum;

	}

	int getSumOfDigitInString(String str) {
		int sum = 0;

		for (int index = 0; index < str.length(); index++) {
			
			if (Character.isDigit(str.charAt(index)))
				sum = sum + Character.getNumericValue(str.charAt(index));

		}
		return sum;
	}

	public static void main(String[] args) {
		String input[] = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		CodingTest1 codingTest1 = new CodingTest1();
		System.out.println(
				"Sum of all the digit available in String array : " + codingTest1.getSumOfDigitInStringArray(input));

	}

}
