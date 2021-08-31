package shweta_Dharmadhikari.string_Assignemnet_25;

/*
 * Program2:
String str = "Ma1U2liK"
output : MUK12ali
 */
public class PrintUppercaseDigitLowercaseFromString {

	String isUppercaseAlphabet = "";
	String isLowercaseAlphabet = "";
	String isdigit = "";
	String output = "";

	String printUppercaseDigitLowercase(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				isUppercaseAlphabet += ch;
			} else if (Character.isLowerCase(ch)) {
				isLowercaseAlphabet += ch;

			} else if (Character.isDigit(ch)) {
				isdigit += ch;
			}
		}
		return isUppercaseAlphabet + isdigit + isLowercaseAlphabet;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Ma1U2liK";
		PrintUppercaseDigitLowercaseFromString printUppercaseDigitLowercaseFromString = new PrintUppercaseDigitLowercaseFromString();
		System.out.println("Output: " + printUppercaseDigitLowercaseFromString.printUppercaseDigitLowercase(input));
	}

}
