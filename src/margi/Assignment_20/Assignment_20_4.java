package margi.Assignment_20;

import java.util.Scanner;

public class Assignment_20_4 {

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
		Assignment_20_4 duplicate = new Assignment_20_4();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = scanner.next();
		duplicate.duplicateChar(word);
		scanner.close();
	}
}
