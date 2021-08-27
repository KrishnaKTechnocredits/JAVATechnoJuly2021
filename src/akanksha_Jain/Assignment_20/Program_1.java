package akanksha_Jain.Assignment_20;

import java.util.Scanner;

public class Program_1 {
	static int count=0;
	
	int freqOfChar(String str, char ch) {
		for(int index=0; index<str.length(); index++) {
			if(str.charAt(index) == ch)
				count ++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scanner.next();
		System.out.println("Enter the character");
		char ch = scanner.next().charAt(0);
		Program_1 program_1 = new Program_1();
		program_1.freqOfChar(str, ch);
		System.out.println("The frequency of " + ch + " character from user defined string " + str + " is " + 
				"" + count);
		scanner.close();
	}
}
