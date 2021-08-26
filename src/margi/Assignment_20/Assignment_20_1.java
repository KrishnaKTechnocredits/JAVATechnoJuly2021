package margi.Assignment_20;

import java.util.Scanner;

public class Assignment_20_1 {

	//frequency of given character from user defined string
	int processData(String input, char ch) {
		int cnt=0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index)==ch)
				cnt++;
		}
		System.out.println(ch + " -> " + cnt);
		return cnt;
	}
	
	public static void main(String[] args) {
		Assignment_20_1 freq = new Assignment_20_1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = scanner.next();
		System.out.println("Enter letter: ");
		char letter = scanner.next().charAt(0);
		freq.processData(word,letter);
		scanner.close();
	}
}
