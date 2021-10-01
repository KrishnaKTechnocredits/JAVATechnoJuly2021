package chirag.assignment42;

/*
Assignment - 42 : 29th Sep'2021 

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"
*/

public class RemoveAllOccurenceOfDuplicateChar {
	
	void getRemoveAllOccurenceOfDuplicateChar(String input) {
		String output = "";
		int count = 0;
		for(int index = 0 ; index < input.length() ; index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch) == input.lastIndexOf(ch)) {
				output = output + ch;
			}
		}
		System.out.println(output);
	}
	public static void main(String[] args) {
		RemoveAllOccurenceOfDuplicateChar removeAllOccurenceOfDuplicateChar=new RemoveAllOccurenceOfDuplicateChar();
		String input = "technocredits";
		removeAllOccurenceOfDuplicateChar.getRemoveAllOccurenceOfDuplicateChar(input);
	}
}