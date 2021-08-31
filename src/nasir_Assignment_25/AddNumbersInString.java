package nasir_Assignment_25;

public class AddNumbersInString {

	int sum = 0;
	String input = "";

	void sumNumbers(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				input += str.charAt(index);
			else if (input != "") {
				sum += Integer.parseInt(input);
				input = "";

			}
		}
		System.out.println("Output:" + sum);

	}

	public static void main(String[] args) {
		AddNumbersInString addNumbersInString = new AddNumbersInString();
		addNumbersInString.sumNumbers("te12ch33no3credit4s");

	}

}
