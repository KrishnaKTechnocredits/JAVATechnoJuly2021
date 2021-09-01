package amol_Pawar.assignment_25;

public class Program_2 {

	void getStringInOrder(String input) {
		String upperString = "";
		String lowerString = "";
		String num = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperString = upperString + ch;
			} else if (Character.isLowerCase(ch)) {
				lowerString = lowerString + ch;
			} else if (Character.isDigit(ch)) {
				num = num + ch;
			}
		}
		System.out.println("Output of Program 2 is : " + upperString + num + lowerString);
	}

	public static void main(String[] args) {
		Program_2 program_2 = new Program_2();
		program_2.getStringInOrder("Ma1U2liK");

	}
}
