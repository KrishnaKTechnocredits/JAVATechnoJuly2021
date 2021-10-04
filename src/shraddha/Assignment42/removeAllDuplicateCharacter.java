/*Assignment - 42 : 29th Sep'2021 
Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"
*/
package shraddha.Assignment42;

public class removeAllDuplicateCharacter {
public static void main(String[] args) {
	String input = "technocredits";
	String output = "";
	System.out.println("Given input String is :- "+input);
	for(int index = 0; index < input.length(); index++) {
		if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
			output += input.charAt(index);
	}
	System.out.println("After removing all occurrence of duplicate character, output will be :- "+output);
}
}
