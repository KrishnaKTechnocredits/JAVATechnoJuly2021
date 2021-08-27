package himanshu_string_assignment;

import java.util.Scanner;

public class FrequncyOfGivenCharacter {

	void frequncy(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		System.out.println(ch + " " + count);

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Given word is : ");
		String input = scanner.next();

		FrequncyOfGivenCharacter program1 = new FrequncyOfGivenCharacter();
		program1.frequncy("technocredits", 'e');
	}

}
