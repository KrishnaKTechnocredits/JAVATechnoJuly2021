package husain.Assignment24;

import java.util.Scanner;

public class Program1 {

	int findCountOfVowels(String str) {
		int count = 0;

		for (int index = 0; index < str.length(); index++) {
			switch (str.charAt(index)) {

			case 'a':
			case 'A':
				count++;
				break;

			case 'e':
			case 'E':
				count++;
				break;

			case 'i':
			case 'I':
				count++;
				break;

			case 'o':
			case 'O':
				count++;
				break;

			case 'u':
			case 'U':
				count++;
				break;

			default:
				break;
			}

		}

		return count;

	}

	int getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string:");
		String str = scanner.nextLine();
		return findCountOfVowels(str);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 obj = new Program1();
		System.out.println("The number of vowels in the given string is: " + obj.getInput());

	}

}
