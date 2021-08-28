//print duplicate characters with their frequency from user defined string
package shreya_assignment_20_frequency_of_character;

import java.util.Scanner;

public class DuplicateCharacterFromString {
	int getFrequencyOfCharacter(String input,char ch) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)==ch)
				count++;
	}
	return count;
}
	void displayDuplicateCharAndFrequency(String input) {
		for(int index=0;index<input.length();index++) {
			char ch =input.charAt(index);
			if(index==input.indexOf(ch)) {
				int frequency=getFrequencyOfCharacter(input,ch);
					if(frequency>1)
						System.out.println("Frequency of "+"\""+ch+"\""+" is "+frequency);
				
			}
		}
		
	}
	public static void main(String[] args) {
		DuplicateCharacterFromString duplicateCharacter=new DuplicateCharacterFromString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		String input=scanner.next();
		duplicateCharacter.displayDuplicateCharAndFrequency(input);
		

}
}
