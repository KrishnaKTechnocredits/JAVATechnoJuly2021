//Program to find frequency of each character from user defined string.
package shreya_assignment_20_frequency_of_character;

import java.util.Scanner;

public class FrequencyOfEachCharacter {
	int getFrequencyOfCharacter(String input,char ch) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)==ch)
				count++;
		}
		return count;
	}
	
	void displayFrequencyOfEachCharacter(String input) {
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(index==input.indexOf(ch))
				System.out.println("Frequency of  "+"\""+ch+"\""+" is "+getFrequencyOfCharacter(input,ch));				
		}
	}
	public static void main(String[] args) {
		FrequencyOfEachCharacter frequencyOfEachCharacter=new FrequencyOfEachCharacter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		String input = scanner.next();
		frequencyOfEachCharacter.displayFrequencyOfEachCharacter(input);

	}

}
