/*Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis
*/
package shraddha.Assignment42;

public class RemoveMultipleOccuranceOfChar {
	public static void main(String[] args) {
		String input = "technocredits";
		String output = "";
		System.out.println("Input String is :- "+input);
		for (int index = 0; index < input.length(); index++) {
			if (!output.contains(input.valueOf(input.charAt(index))))
				output += input.charAt(index);
		}
		System.out.println("After removing multpile occurances of characters, output will be:- "+output);
	}
}
