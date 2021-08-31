package amol_Pawar.assignment_22;

public class Program_1 {

	void getTotalDigit(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("Total number of character in string " + input + " : " + count);
	}

	public static void main(String[] args) {

		Program_1 program_1 = new Program_1();
		String str = "Te1ch2no3cr4ed3it4s";
		program_1.getTotalDigit(str);
	}
}
/*
 * Program 1 : Find total digits in a given string. String str =
 * "Te1ch2no3cr4ed3it4s" output : 6
 */