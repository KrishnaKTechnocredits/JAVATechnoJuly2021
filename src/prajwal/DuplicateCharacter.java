package prajwal;

import java.util.Scanner;

public class DuplicateCharacter {

	//print duplicate characters with their frequency
	int processData(String input, char ch) {
		int cnt=0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index)==ch)
				cnt++;
		}
		System.out.println(ch + " -> " + cnt);
		return cnt;
	}

	void duplicateChar(String input) {
		for(int index=0; index<input.length(); index++) {
			if(input.indexOf(input.charAt(index))!=input.lastIndexOf(input.charAt(index))) {
				if(index==input.indexOf(input.charAt(index)))
					processData(input,input.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		DuplicateCharacter duplicate = new DuplicateCharacter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = scanner.next();
		duplicate.duplicateChar(word);
		scanner.close();
	}
}