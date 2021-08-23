package sagar_Anasane;

import java.util.Scanner;

public class Assignment19 {
	void noOfWordsInGivenStatement(String input) {
		int count = 0;
		for (int index =0;index < input.length();index ++) {
			String[] str = input.split(" "); 
			char ch = input.charAt(index);
			if (ch == ' ') {
				count++;
			}
		}
		System.out.println(input.length() + ++count);
	}
	
	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input : ");
		String input = scanner.next();
		assignment19.noOfWordsInGivenStatement(input);
	}
}
