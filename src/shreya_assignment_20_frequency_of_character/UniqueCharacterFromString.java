//print unique characters from user defined string.

package shreya_assignment_20_frequency_of_character;

import java.util.Scanner;

public class UniqueCharacterFromString {
	void displayUniqueCharacter(String input) {
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
		    if(input.indexOf(ch)==input.lastIndexOf(ch)) {
		    	System.out.println(ch);
		    }
		}
	}
	public static void main(String[] args) {
		UniqueCharacterFromString uniqueCharacter=new UniqueCharacterFromString();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the word");
		String input = scanner.next();
		System.out.println("Unique characters from the word "+input+" are: ");
		uniqueCharacter.displayUniqueCharacter(input);
	}

}
