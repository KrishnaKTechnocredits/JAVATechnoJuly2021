package kalpesh;

import java.util.Scanner;

public class Assignment_20_Program_4 {
	void findDuplicateChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int count = 0;
			for (int index1 = 0; index1 < str.length(); index1++) {
				if (str.charAt(index1) == ch && index == str.indexOf(ch))
					count++;
			}
			if (count > 0 && count != 1)
				System.out.println(str.charAt(index) + " -> " + count);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scanner.next();
		Assignment_20_Program_4 program_4 = new Assignment_20_Program_4();
		program_4.findDuplicateChar(str);
		scanner.close();
	}
}

/*
 * program 4 : print duplicate characters with their frequency from user defined
 * string. input : word -> aakanksha output : a -> 4 k -> 2
 */