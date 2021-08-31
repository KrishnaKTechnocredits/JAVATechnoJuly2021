package chandni_bhoj_Assignment_20;

import java.util.Scanner;

public class Program_1 {
	
	int getFrequencyOfCharacter (String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner1 = new Scanner (System.in);
		System.out.println ("Please enter a word");
		String input1 = scanner1.next();
		System.out.println ("Please enter character to get the frequency of same from given word");
		char ch1 = scanner1.next().charAt(0);
		
		Program_1 program_1 = new Program_1 ();
		program_1.getFrequencyOfCharacter(input1, ch1);
		System.out.println ("Frequency of " + ch1 + " is " + program_1.getFrequencyOfCharacter(input1, ch1));
		
	}
}
