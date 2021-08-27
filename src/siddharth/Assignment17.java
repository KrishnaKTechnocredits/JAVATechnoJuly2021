package siddharth;

public class Assignment17 {
	char getReverseString(String input) {

		char reverse=0;

		System.out.println(input);

		for (int index = input.length() - 1; index >= 0; index--) {

			reverse = input.charAt(index);
			System.out.print(reverse);
		}
		
		return reverse;
	}

	public static void main(String[] args) {

		String input = "technocredits";

		Assignment17 assignment17 = new Assignment17();
		assignment17.getReverseString(input);
	}
}
