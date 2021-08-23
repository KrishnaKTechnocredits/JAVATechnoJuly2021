package amol_Pawar.Assignment_20;

public class Program_3 {

	void getStringFromUser(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				System.out.println("Non repetative words in String " + input + " : " + ch);
			// getUniqueCharFromString(String input, char ch);
		}
	}

	/*
	 * void getUniqueCharFromString(String input, char ch) { int count = 0; for (int
	 * index = 0; index < input.length(); index++) {
	 * 
	 * if (ch == input.charAt(index)) { count++; } } if (count == 1)
	 * System.out.println("Non repetative words in String "+input+ " : " + ch); }
	 */
	public static void main(String[] args) {
		Program_3 program_3 = new Program_3();
		program_3.getStringFromUser("technocredits");
	}

}
