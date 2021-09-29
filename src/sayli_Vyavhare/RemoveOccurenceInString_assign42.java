/*Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/
package sayli_Vyavhare;

public class RemoveOccurenceInString_assign42 {

	void remove_All_Occurrence(String input) {
		// Program:2 Remove all occurrence of duplicate character from given string.

		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				output += ch;
			}
		}
		System.out.println("After Removing  all occurrence of duplicate character from given string :" + output + "\n ");
	}

	void remove_Multiple_Occurrences(String input) {
		//Program 1: Remove multiple occurrence of characters from given string.
		String output = " ";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (input.indexOf(ch) == index) {
				output += ch;
			}
		}
		System.out.println("After removing multiple occurrence of characters from given string:" + output);
	}

	public static void main(String[] args) {
		RemoveOccurenceInString_assign42 remove = new RemoveOccurenceInString_assign42();
		String input = "technocredits";
		System.out.println("Given String is: " + input + "\n");
		remove.remove_All_Occurrence(input);
		remove.remove_Multiple_Occurrences(input);
	}

}
