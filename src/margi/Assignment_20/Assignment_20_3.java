package margi.Assignment_20;

import java.util.Scanner;

public class Assignment_20_3 {
	
	//print unique characters from user defined string
	void uniqueChar(String input) {
		for(int index=0; index<input.length(); index++) {
			if(input.indexOf(input.charAt(index))==input.lastIndexOf(input.charAt(index)))
				System.out.println(input.charAt(index));
		}
	}
	public static void main(String[] args) {
		Assignment_20_3 unique = new Assignment_20_3();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word: ");
		String word = scanner.next();
		unique.uniqueChar(word);
		scanner.close();
	}

}
