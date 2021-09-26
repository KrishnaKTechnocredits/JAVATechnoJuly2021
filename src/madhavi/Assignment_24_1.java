package madhavi;

public class Assignment_24_1 {

	void getNoOfVowels(String input) {
		String str = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i'
					|| input.charAt(index) == 'o' || input.charAt(index) == 'u') {
				if (index == input.indexOf(ch)) {
					if (str.isEmpty()) {

						str = str + " " + input.charAt(index);

					} else {
						str = str + "," + input.charAt(index);
					}
				}
			}
		}

		System.out.println("vowels are" + str);
	}

	public static void main(String[] args) {

		Assignment_24_1 assignment_24_1 = new Assignment_24_1();
		String input = "technocredits";
		assignment_24_1.getNoOfVowels(input);

	}
}
