package chirag.assignment42;

/*
Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis
*/

public class RemoveMultipleOccurenceOfChar {
	
	void getRemoveMultipleOccurenceOfChar(String input) {
		String output = "";
		for(int index = 0 ; index < input.length() ; index++) {
			char ch = input.charAt(index);
			if(index == input.indexOf(ch)) {
				output = output + ch;
				}
			}
		System.out.println(output);
	}
	public static void main(String[] args) {
		RemoveMultipleOccurenceOfChar removeMultipleOccurenceOfChar = new RemoveMultipleOccurenceOfChar();
		String input = "technocredits";
		removeMultipleOccurenceOfChar.getRemoveMultipleOccurenceOfChar(input);
	}
}