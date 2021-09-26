package dattaraj;

import java.util.Scanner;

public class Assignment_20_P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_20_P3 assign_20_P3 = new Assignment_20_P3();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Word");
		String word = scanner.next();
		assign_20_P3.getuniqueCharsfromString(word);
		scanner.close();
	}

	void getuniqueCharsfromString(String word) {
		// TODO Auto-generated method stub
		for (int index = 0; index < word.length(); index++) {
			if (getCharCount(word, word.charAt(index)) == 1) {
				System.out.println(word.charAt(index));
				
			}
		}
	}
	
	int getCharCount(String word, char character) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == character) {
				cnt++;
			}
		}

		return cnt;
	}

}
