package tarangAssignment25;

public class Assignment25 {
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
		Assignment25 assignment25 = new Assignment25();
		assignment25.sumNumbers("te12ch33no3credit4s");

	}
}