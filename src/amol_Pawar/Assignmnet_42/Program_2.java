package amol_Pawar.Assignmnet_42;

public class Program_2 {

	void getString(String input) {
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				str = str + ch;
			}
		}
		System.out.println("Remove all occurrence of duplicate character from given string " + input + " is : " + str);
	}

	public static void main(String[] args) {

		Program_2 program_2 = new Program_2();
		program_2.getString("technocredits");

	}

}
/*
 * Program 2: Remove all occurrence of duplicate character from given string.
 * input : "technocredits" output : "hnordis"
 */
