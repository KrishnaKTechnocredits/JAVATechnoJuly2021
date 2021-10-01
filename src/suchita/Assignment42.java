package suchita;
//Assignment 42

class Assignment42 {

	//Remove multiple occurrence of characters from given string.
	
	void removeMultipleCharacter(String input) {
	
		String output = "";
		System.out.println("\nGiven string :: " + input);
			for (int index = 0; index < input.length(); index++) {
				
				char ch = input.charAt(index);
				if (input.indexOf(ch) == index)
				output += ch;
		}
		System.out.println("Output String :: " + output);
	}
	
	//Remove duplicate characters from given string.
	void removeDuplicateCharacters(String input) {
		
		String output = "";
		System.out.println("\nGiven string :: " + input);
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				output += ch;
		}
		System.out.println("Output string :: " + output);
	}
	
	public static void main(String[] args) {
		
		Assignment42 assignment = new Assignment42();
		String input = "technocredits";
		assignment.removeMultipleCharacter(input);
		assignment.removeDuplicateCharacters(input);
	}
}