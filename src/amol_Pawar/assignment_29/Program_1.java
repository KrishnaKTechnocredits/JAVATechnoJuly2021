package amol_Pawar.assignment_29;

public class Program_1 {

	void getReverseString(String input) {
		String str = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			str = str + ch;
		}
		if (input.equals(str)) {
			System.out.println("Given String " + input + " is pallindrome string");
		} else {
			System.out.println("Given string " + input + " is not pallindrome string");
		}
	}

	public static void main(String[] args) {
		Program_1 program_1 = new Program_1();
		String input = "naman";
		program_1.getReverseString(input);
		program_1.getReverseString("st");
	}

}
/*
 * Program 1 : String Pallindrome by writing reverse method logic. String input
 * = "naman";
 */