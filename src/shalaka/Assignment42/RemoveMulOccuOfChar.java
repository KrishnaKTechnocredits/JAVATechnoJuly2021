package shalaka.Assignment42;

/*
Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis
*/
public class RemoveMulOccuOfChar {

	void removeDuplicate(String str) {

		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == index)
				output = output + ch;
		}

		System.out
				.println("Remove multiple occurrence of characters from: " +str + "\nThe output string is: " +output);

	}

	/*
	 * void removeAllDuplicates(String str) {
	 * 
	 * String str1 = str; for (int index = 0; index < str.length(); index++) { if
	 * (str.indexOf(str.charAt(index)) != str.lastIndexOf(str.charAt(index))) str =
	 * str.replaceAll(String.valueOf(str.charAt(index)), ""); }
	 * 
	 * System.out.
	 * println("The output string after removing multiple occurrences in \"" + str1
	 * + "\" is " + str);
	 * 
	 * }
	 */

	public static void main(String args[]) {
		RemoveMulOccuOfChar removeMulOccuOfChar = new RemoveMulOccuOfChar();
		String str = "technocredits";
		removeMulOccuOfChar.removeDuplicate(str);
		// obj.removeAllDuplicates(str);
	}

}
