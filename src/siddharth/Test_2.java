package siddharth;

public class Test_2 {
	void
	allLowerToUpper(String input) {

		String finalOuput = "";

		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);

			if (Character.isUpperCase(ch)) {
				finalOuput = finalOuput + Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				finalOuput = finalOuput + Character.toUpperCase(ch);
			} else
				finalOuput = finalOuput + ch;
		}
		System.out.println(finalOuput);
	}

	public static void main(String[] args) {

		String input = "A1ashVi6";

		Test_2 ex = new Test_2();
		ex.allLowerToUpper(input);

	}
}
