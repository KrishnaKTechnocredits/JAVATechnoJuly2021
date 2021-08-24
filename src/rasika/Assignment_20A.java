package rasika;

import java.util.Scanner;

public class Assignment_20A {
	int getCount(String input, char ch) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			if(input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("The frequency of "+ch + " is " +count);
		return count;
	}
	void getFrequencyOfChar(String input) {
		for(int index = 0; index < input.length(); index++) {
			if(index == input.indexOf(input.charAt(index)))
			getCount(input, input.charAt(index));
		}
	}
	void getUniqueCharacters(String input) {
		for(int index = 0; index < input.length(); index++) {
			if(input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
			{
				getCount(input, input.charAt(index));
			}
		}		
	}
	void getDuplicateCharacters(String input) {
		for(int index = 0; index < input.length(); index++) {
			if(input.indexOf(input.charAt(index)) != input.lastIndexOf(input.charAt(index)))
			{
				getCount(input, input.charAt(index));
			}
		}		
	}
	public static void main(String[] args) {
		String string = "technocredits";
		Assignment_20A assignment_20A = new Assignment_20A();
		System.out.println("Enter the character from word technocredits");
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		assignment_20A.getCount(string, ch);
		assignment_20A.getFrequencyOfChar(string);
		System.out.println("Unique characters are ");
		assignment_20A.getUniqueCharacters(string);
		System.out.println("Duplicate characters are ");
		assignment_20A.getDuplicateCharacters(string);
	}
}
