package arti_G_CodingTest_2;

import java.util.Scanner;

/*Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6*/
public class CodeTest {
	
	String convertLowerCaseToUpperCase(String input) {
		String Result = " ";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			boolean flag = Character.isLetter(ch);
			if(flag) {
				if(Character.isLowerCase(ch)) {
					ch=Character.toUpperCase(ch);
				}
				else if(Character.isUpperCase(ch)) {
					ch=Character.toLowerCase(ch);
				}
				Result=Result+ch;
			}
			else {
				Result=Result+ch;
			}
		}
		return Result;
	}
	public static void main(String[] args) {
		CodeTest codeTest = new CodeTest();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String ");
		String input = scanner.nextLine();
		System.out.println(codeTest.convertLowerCaseToUpperCase(input));

	}

}
