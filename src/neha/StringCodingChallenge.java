package neha;

/*String str = "Ma1U2liK"
output : MUK12ali*/
public class StringCodingChallenge {
	String findCapitalSmallLettersNumbers(String str) {
		String capitalStr = "";
		String smallStr = "";
		String numStr = "";
		for (int index = 0; index < str.length(); index++) {

			char ch = str.charAt(index);
			if (ch >= 'A' && ch <= 'Z')
				capitalStr = capitalStr + String.valueOf(ch);
			if (ch >= 'a' && ch <= 'z')
				smallStr = smallStr + String.valueOf(ch);
			if (Character.isDigit(ch)) {
				numStr = numStr + Character.getNumericValue(ch);
			}

		}
		return capitalStr + numStr + smallStr;

	}

	public static void main(String[] args) {
		StringCodingChallenge stringCodingChallenge = new StringCodingChallenge();
		String str = "Ma1U2liK";
		System.out.println("Output is: " + stringCodingChallenge.findCapitalSmallLettersNumbers(str));
	}

}
