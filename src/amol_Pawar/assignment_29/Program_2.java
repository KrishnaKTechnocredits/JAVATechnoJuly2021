package amol_Pawar.assignment_29;

public class Program_2 {
	boolean displayPallindromeResult(String input) {

		for (int index = 0; index < input.length(); index++) {

			if (input.charAt(index) == input.charAt((input.length() - 1) - index)) {
				return true;

			} else {
				return false;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		Program_2 program_2 = new Program_2();
		String input = "madam";
		boolean flag = program_2.displayPallindromeResult(input);

		if (flag)
			System.out.println("Given input string " + input + " is Pallindrome");
		else
			System.out.println("Given input string " + input + " is not Pallindrome");
	}
}
