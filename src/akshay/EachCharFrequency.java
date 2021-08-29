package akshay;

import java.util.Scanner;

public class EachCharFrequency {
	
	void getFrequencyOfChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println(input + " -> " + ch + " is : " + count);
	}

	void getFrequencyOfEachChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == index)
				getFrequencyOfChar(input, ch);
		}
	}
	
	public static void main(String[] args) {
		EachCharFrequency program_2 = new EachCharFrequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to which frequency of each character need to find ");
		String word = sc.next();
		program_2.getFrequencyOfEachChar(word);
	}
}
