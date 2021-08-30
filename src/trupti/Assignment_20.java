package trupti;

import java.util.Scanner;

public class Assignment_20 {
	
	public static void main(String[] args) {
		Assignment_20 assignment_20=new Assignment_20();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the word:");
		String str=input.next();
		System.out.println("Enter the character:");
		char ch=input.next().charAt(0);
		assignment_20.findFrequencyOfCharacter(str,ch);
		
		Scanner input1=new Scanner(System.in);
		System.out.println("Enter the word:");
		String str1=input1.next();
		assignment_20.charFrequency(str1);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input word");
		String inputWord = scanner.next();
		assignment_20.charFrequency1(inputWord);
	}
	
	
	int findFrequencyOfCharacter(String str, char ch) {
		int count=0;
		for(int index=0; index<str.length(); index++) {
			if(str.charAt(index)==ch) {
				count++;
			}
		}
		System.out.println("Frequency of charactr is: "+count);
		return count;
	}
	
	void charFrequency(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (index == str.indexOf(str.charAt(index)))
				System.out.println(str.charAt(index) + "->" + findFrequencyOfCharacter(str, str.charAt(index)));
		}
	}
	
	void charFrequency1(String word) {
		for (int index = 0; index < word.length(); index++) {
			if (word.indexOf(word.charAt(index)) == word.lastIndexOf(word.charAt(index)))
				System.out.println(word.charAt(index));
		}
	}
}
