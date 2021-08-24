package mratunjay.Assignment_20;

import java.util.Scanner;

public class Assignment_20 {

	void findFrequencyOfGivernCharacter(String str, char ask) {
		int count = 0;

		for (int index = 0; index < str.length(); index++) {

			if (ask == str.charAt(index)) {
				count++;
			}
		}

		System.out.println("frequency of character count : " + count);
	}

	void findFrequenctofEachCharacter(String str) {

		for (int index = 0; index < str.length(); index++) {

			int count = 0;

			if (index == str.indexOf(str.charAt(index))) {
				for (int j = 0; j < str.length(); j++) {

					if (str.charAt(index) == str.charAt(j)) {
						count++;
					}

				}
				System.out.println(str.charAt(index) + "->" + count);

			}
		}

	}

	void findFrequenctofUniqeuCharacter(String str) {

		for (int index = 0; index < str.length(); index++) {

			int count = 0;

			if (index == str.indexOf(str.charAt(index))) {
				for (int j = 0; j < str.length(); j++) {

					if (str.charAt(index) == str.charAt(j)) {
						count++;
					}

				}
				if (count == 1) 
				System.out.println(str.charAt(index));
				
			}
		}

	}
	void findFrequenctofDuplicateCharacter(String str) {

		for (int index = 0; index < str.length(); index++) {

			int count = 0;

			if (index == str.indexOf(str.charAt(index))) {
				for (int j = 0; j < str.length(); j++) {

					if (str.charAt(index) == str.charAt(j)) {
						count++;
					}

				}
				if (count > 1) 
				System.out.println(str.charAt(index)+"-> "+count);
				
			}
		}

	}

	public static void main(String[] args) {

		System.out.println("Enter word");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println("Enter character");
		char ch = scanner.next().charAt(0);
		Assignment_20 A_20 = new Assignment_20();
		A_20.findFrequencyOfGivernCharacter(str, ch);
		System.out.println("Enter input string");
		A_20.findFrequenctofEachCharacter(scanner.next());
		System.out.println("Enter input string");
		A_20.findFrequenctofUniqeuCharacter(scanner.next());
		System.out.println("Enter input string");
		A_20.findFrequenctofDuplicateCharacter(scanner.next());
		scanner.close();
	}

}
