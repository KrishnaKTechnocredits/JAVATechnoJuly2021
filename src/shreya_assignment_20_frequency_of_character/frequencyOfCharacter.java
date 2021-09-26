//Program to find frequency of given character from user defined string.

package shreya_assignment_20_frequency_of_character;

import java.util.Scanner;

public class frequencyOfCharacter {
	int getFrequencyOfGivenCharacter(String input,char ch) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)==ch)
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		frequencyOfCharacter frequencyOfCharacter=new frequencyOfCharacter();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the word ");
		String input=scanner.next();
		System.out.println("Enter the character ");
		char ch=scanner.next().charAt(0);
		System.out.println("Frequency of character "+"\""+ch+"\""+" in "+"\""+input+"\""+" is "+frequencyOfCharacter.getFrequencyOfGivenCharacter(input, ch));
		
		

	}

}
