package husain.Assignment19;

import java.util.Scanner;

public class Program3 {
	
	void captureInput() {
		System.out.println("Please enter a word: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		charFrequency(str);

	}

	void printFrequency(String str, char ch) {

		int count = 0;

		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}

		System.out.println("The frequency of unique characters " + ch + " is: " + count);
	}

	void charFrequency(String str) {
		for (int index = 0; index < str.length(); index++)
			if (str.indexOf(str.charAt(index)) == str.lastIndexOf(str.charAt(index)))
				printFrequency(str, str.charAt(index));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program3 freq = new Program3();
		freq.captureInput();

	}

}
