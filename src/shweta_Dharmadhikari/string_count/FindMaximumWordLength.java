package shweta_Dharmadhikari.string_count;

import java.util.Scanner;

public class FindMaximumWordLength {

	String getMaxWordFromString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = scan.nextLine();
		String[] output = str.split(" ");
		String maxWord = "";

		for (int index = 0; index < output.length; index++) {
			if (output[index].length() > maxWord.length()) {
				maxWord = output[index];
			}
		}
		scan.close();
		return maxWord;
	}

	public static void main(String[] args) {
		FindMaximumWordLength findMaximumWordLength = new FindMaximumWordLength();
		System.out.println("Maximux length word in given string is : " + findMaximumWordLength.getMaxWordFromString());
	}

}
