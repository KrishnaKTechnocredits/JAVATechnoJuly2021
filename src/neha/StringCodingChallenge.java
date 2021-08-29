package neha;

import java.util.Arrays;

/*String str = "Ma1U2liK"
output : MUK12ali*/
public class StringCodingChallenge {
	String[] findCapitalSmallLettersNumbers(String str) {
		String[] output = { "", "", "" };

		for (int index = 0; index < str.length(); index++) {

			char ch = str.charAt(index);
			if (ch >= 'a' && ch <= 'z')
				output[0] = String.valueOf(ch) + output[0];
			if (ch >= 'A' && ch <= 'Z')
				output[1] = String.valueOf(ch) + output[1];
			if (Character.isDigit(ch)) {
				output[2] = output[2] + Character.getNumericValue(ch);
			}

		}
		return output;

	}

	public static void main(String[] args) {
		StringCodingChallenge stringCodingChallenge = new StringCodingChallenge();
		String str = "Ma1U2liK";
		System.out.println("Capital, Small letters and numbers are separated and collected in array as follows: "
				+ Arrays.toString(stringCodingChallenge.findCapitalSmallLettersNumbers(str)));
	}

}
