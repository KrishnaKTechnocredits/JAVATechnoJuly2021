package aniket;

public class Assignment_42_1 {
	String removeMultipleOccurence(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == index) {
				output += ch;

			}

		}

		return output;
	}

	public static void main(String[] args) {

		String str = "technocredits";
		System.out.println("Output string is : " + new Assignment_42_1().removeMultipleOccurence(str));

	}
}
