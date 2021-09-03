package varun.varun_string_assignment;

public class StringSeggarate {
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
		System.out.println(upperCase + lowerCase + digit);
	}

	public static void main(String[] args) {
		StringSeggarate stringSeggarate = new StringSeggarate();
		String str = "Ma1U2liK";
		stringSeggarate.arrangeTheLetters(str);
	}
}