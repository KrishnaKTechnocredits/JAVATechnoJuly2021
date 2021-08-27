/*
 * Surprise coding test : 26th Aug 2021

WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52

Hint: 6+9+16+4+17 = 52

And I am going to review your code after the session time.
Do not disappoint me.

Timing : 7:45 am to 8:30 am

All the best.
Branch name : yourName_ScodingTest_1;
 */
package umakant;

public class SurpriseTest {

	int getSumOfDigitsInStringArray(String[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			for (int innerindex = 0; innerindex < input[index].length(); innerindex++) {
				if (Character.isDigit(input[index].charAt(innerindex)))
					sum += Character.getNumericValue(input[index].charAt(innerindex));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String[] input = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		System.out.println(new SurpriseTest().getSumOfDigitsInStringArray(input));
	}

}
