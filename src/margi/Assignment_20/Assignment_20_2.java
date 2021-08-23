package margi.Assignment_20;

import java.util.Scanner;

public class Assignment_20_2 {
	
	//frequency of each character from user defined string
	int processData(String input, char ch) {
		int cnt=0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index)==ch)
				cnt++;
		}
		System.out.println(ch + " -> " + cnt);
		return cnt;
	}
	void freqOfAllChar(String input) {
		for(int index=0; index<input.length(); index++) {
			if(index==input.indexOf(input.charAt(index)))
				processData(input,input.charAt(index));
		}
	}
	public static void main(String[] args) {
		Assignment_20_2 freq = new Assignment_20_2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = scanner.next();
		freq.freqOfAllChar(word);
		scanner.close();
	}
}
