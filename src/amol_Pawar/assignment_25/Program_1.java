package amol_Pawar.assignment_25;

public class Program_1 {

	void displayString(String input) {

		int twoDigit = 0;
		int singleDigit = 0;
		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				if (Character.isDigit(ch) && Character.isDigit(input.charAt(index + 1))) {
					String num = "";
					num = num + ch + input.charAt(index + 1);

					twoDigit = twoDigit + Integer.parseInt(num);

				} else if (Character.isDigit(ch) && Character.isLetter(input.charAt(index - 1))) {

					singleDigit = singleDigit + Character.getNumericValue(ch);
				}
			}

		}
		int sum = singleDigit + twoDigit;
		System.out.println("Sum of numbers in given String " + input + " : " + sum);
	}

	public static void main(String[] args) {
		Program_1 program_1 = new Program_1();
		program_1.displayString("te12ch33no3credit4s");
	}

}
