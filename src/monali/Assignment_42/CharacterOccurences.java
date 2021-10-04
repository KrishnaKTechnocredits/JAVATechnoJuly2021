package monali.Assignment_42;
/*Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.
input : "technocredits"
output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/

public class CharacterOccurences {

	private String removeMultipleOccurence(String str) {

		String output = "";
		for (int index = 0; index < str.length(); index++) {
			if (index == str.indexOf(str.charAt(index))) // Check index suppose t=0 and if t is duplicate at index 11
															// but indexof method return index 0 so index mismatches and
															// condition false.
				output += str.charAt(index);
		}
		return output;
	}

	private String removeDuplicateCharacterOccurence(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			if (str.indexOf(str.charAt(index)) == str.lastIndexOf(str.charAt(index))) {
				output += str.charAt(index);
			}
		}
		return output;

	}

	public static void main(String[] args) {
		String input = "technocredits";
		CharacterOccurences charOccur = new CharacterOccurences();
		System.out.println(input + " : remove multiple occurences --> " + charOccur.removeMultipleOccurence(input));
		System.out.println(
				input + " : remove duplicate occurences --> " + charOccur.removeDuplicateCharacterOccurence(input));

	}
}
