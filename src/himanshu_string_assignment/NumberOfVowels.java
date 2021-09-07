package himanshu_string_assignment;

public class NumberOfVowels {

	void findNumberOfVowels(String input) {

		String vowels = "";
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index))) {
				switch (input.charAt(index)) {
				case 'a':
					vowels = vowels + " " + input.charAt(index);
					break;
				case 'e':

					vowels = vowels + " " + input.charAt(index);
					break;
				case 'i':

					vowels = vowels + " " + input.charAt(index);
					break;
				case 'o':

					vowels = vowels + " " + input.charAt(index);
					break;
				case 'u':

					vowels = vowels + " " + input.charAt(index);
					break;
				}

			}

		}
		System.out.println("Number of Vowels : " + vowels);
	}

	public static void main(String[] args) {

		String input = "technocredits";

		NumberOfVowels ass24 = new NumberOfVowels();
		ass24.findNumberOfVowels(input);
	}

}
