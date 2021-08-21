package husain.Assignment19;

import java.util.Scanner;

public class Program4 {
	
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

		System.out.println("The frequency of character " + ch + " -> " + count);
	}

	void charFrequency(String str) {
		for (int index = 0; index < str.length(); index++)
			if (str.indexOf(str.charAt(index)) != str.lastIndexOf(str.charAt(index)))
				if(str.indexOf(str.charAt(index))== index)
					printFrequency(str, str.charAt(index));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program4 freq = new Program4();
		freq.captureInput();

	}

}
