package aniket;

public class Program3 {

	void getStringFromUser(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				System.out.println("Non repetative words in String " + input + " : " + ch);
			// getUniqueCharFromString(String input, char ch);
		}
	}

	public static void main(String[] args) {
		Program3 program_3 = new Program3();
		program_3.getStringFromUser("technocredits");
	}

}
