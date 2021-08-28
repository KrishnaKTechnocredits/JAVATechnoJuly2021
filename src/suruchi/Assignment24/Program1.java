package suruchi.Assignment24;

import java.util.Scanner;

public class Program1 {

	void getVowelsInString(String input) {
		String str = "";
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index))) {
				switch (input.charAt(index)) {
				case 'a':
					str += "a ";
					count++;
					break;
				case 'e':
					str += "e ";
					count++;
					break;
				case 'i':
					str += "i ";
					count++;
					break;
				case 'o':
					str += "o ";
					count++;
					break;
				case 'u':
					str += "u ";
					count++;
					break;
				}
			}
		}
		System.out.println("Total vowels in the word are: " + count);
		System.out.println("Vowels in the word are: " + str);
	}

	void getMaxRepeatingWordInString(String input) {
		String[] arr = input.split(" ");
		int count;
		int maxFrequency = 0;
		String maxFreqWord = "";
		for (int index = 0; index < arr.length; index++) {
			count = 0;
			for (int index2 = 0; index2 < arr.length; index2++) {
				if (arr[index].equals(arr[index2])) {
					count++;
				}
				if (maxFrequency < count) {
					maxFrequency = count;
					maxFreqWord = arr[index];
				}
			}
		}
		System.out.println(
				"Maximum repeating word in the string is: " + maxFreqWord + " repeated " + maxFrequency + " times");
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string:");
		String input = scanner.nextLine();
		  
		program1.getMaxRepeatingWordInString(input);

		System.out.println();
		System.out.println("Enter a word:");
		String input2 = scanner.next();

		program1.getVowelsInString(input2);

		scanner.close();
	}
}