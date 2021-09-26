package somnath;
public class Assignment25_2 {

	void getString(String str) {
		String output = "";
		String upperString = "";
		String digit = "";
		String lowerString = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperString = upperString + String.valueOf(ch);
			} else if (Character.isLowerCase(ch)) {
				lowerString = lowerString + String.valueOf(ch);
			} else {
				if (Character.isDigit(ch)) {
					digit = digit + String.valueOf(ch);
				}
			}
		}
		output = upperString + digit + lowerString;
		System.out.println("output: " + output);
	}

	public static void main(String[] args) {
		Assignment25_2 assignment25_2 = new Assignment25_2();
		String str = "Ma1U2liK";
		assignment25_2.getString(str);

	}
}