package aniket;

public class Assignment_42_2 {

	String removeDuplicate(String str) {
		// int charIndex=0;
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				output += str.charAt(index);

			}

		}
		return output;
	}

	public static void main(String[] args) {

		String str = "technocredits";
		System.out.println("Output string is : " + new Assignment_42_2().removeDuplicate(str));
	}
}
