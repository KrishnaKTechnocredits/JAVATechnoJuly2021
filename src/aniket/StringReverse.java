package aniket;

public class StringReverse {
	String getReverseString(String name) {// Aniket
		String output = "";
		for (int index = name.length() - 1; index >= 0; index--) {
		//	char rev = name.charAt(index);
			output +=name.charAt(index);
			// System.out.print(rev);
		}

		return output;

	}

	public static void main(String[] args) {
		String name = "Aniket";
		StringReverse reversestring = new StringReverse();
		//String output = reversestring.getReverseString(name);
		System.out.println(reversestring.getReverseString(name));

	}

}
