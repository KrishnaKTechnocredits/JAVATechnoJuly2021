package shalaka.arrayprograms;

import java.util.Scanner;

public class FreqOfChar_Asignment20 {

	int getFreqOfChar(String word, char ch) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			if (ch == word.charAt(index)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FreqOfChar_Asignment20 freqOfChar_Asignment20 = new FreqOfChar_Asignment20();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		String inputword = scanner.next();
		System.out.println("Enter a character");
		char ch = scanner.next().charAt(0);
		int output = freqOfChar_Asignment20.getFreqOfChar(inputword, ch);
		System.out.println("Frequency of " + ch + " in the " + inputword + " is " + output);
		scanner.close();
	}

}
