package monali.Assignment_20;

import java.util.Scanner;

public class EachCharacterFrequency {

	int getCharCount(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		System.out.println("In word : " + str + " Frequency of character " + ch + " count is " + count);
		return count;
	}

	void printFreqOfEachChar(String str) {

		for (int index = 0; index < str.length(); index++) {
			if (index == str.indexOf(str.charAt(index))) {
				getCharCount(str, str.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		EachCharacterFrequency eachCharFreq = new EachCharacterFrequency();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = scanner.next();
		eachCharFreq.printFreqOfEachChar(str);

	}
}
