package himanshu_string_assignment;

public class SmallCapitalString {

	String upperCase = "";
	String lowerCase = "";
	String digit = "";

	void arrangeTheLetters(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (Character.isUpperCase(str.charAt(index)))
				upperCase += str.charAt(index);
			else if (Character.isLowerCase(str.charAt(index)))
				lowerCase += str.charAt(index);
			else if (Character.isDigit(str.charAt(index)))
				digit += Character.getNumericValue(str.charAt(index));
		}
		System.out.println(upperCase + digit + lowerCase);
	}

	public static void main(String[] args) {

		String input = "Ma1U2liK";

		SmallCapitalString smallCapitalString = new SmallCapitalString();
		smallCapitalString.arrangeTheLetters(input);
	}
}
