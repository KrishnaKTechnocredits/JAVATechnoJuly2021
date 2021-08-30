package riten;

class CodingTest2 {

	void upperLower(String input) {
		String result = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			} else if (Character.isDigit(ch)) {

			}
			result = result + ch;
		}
		System.out.println("After conversion string is: " + result);
	}

	public static void main(String[] args) {
		CodingTest2 test = new CodingTest2();
		String input = "A1ashVi6";
		test.upperLower(input);

	}

}