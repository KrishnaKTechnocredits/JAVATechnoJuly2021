/*
 Assignment - 35 : 16th Sep'2021
Write a program to verify given number plate number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid
 */

package husain.Assignment35;

import chirag.codingTest.NewString;

public class ValidFormat {

	void validateFormat(String str) {

		boolean flag = true;
		if (str.length() == 13) {
			if (countparts(str) == 4) {
				if (validateSpaces(str)) {
					if (validateLetters(str)) {
						if (validateNumbers(str))
							flag = true;
						else
							flag = false;

					} else
						flag = false;
				} else
					flag = false;
			} else if (countparts(str) == 3) {
				if (validateSpaces(str)) {
					if (str.replaceAll("-", "").length() == 12) {
						if (str.charAt(2) == '-') {
							if (validateLetters(str.replaceAll("-", ""))) {
								if (validateNumbers(str.replaceAll("-", " ")))
									flag = true;
								else
									flag = false;

							} else
								flag = false;

						} else
							flag = false;
					} else
						flag = false;
				} else
					flag = false;

			} else
				flag = false;
		}

		else
			flag = false;

		if (flag)
			System.out.println(str + " is a valid plate number");
		else
			System.out.println(str + " is an invalid plate number");

	}

	int countparts(String str) {

		int count = str.split(" ").length;
		return count;

	}

	boolean validateSpaces(String str) {
		if (str.charAt(2) == ' ' && str.charAt(5) == ' ' && str.charAt(8) == ' ') {
			return true;

		} else if (str.charAt(5) == ' ' && str.charAt(8) == ' ') {
			return true;

		}

		return false;

	}

	boolean validateLetters(String str) {

		String arr[] = str.split(" ");
		String newStr = arr[0] + arr[2];
		boolean flag = false;

		for (int index = 0; index < newStr.length(); index++) {
			if (Character.isUpperCase(newStr.charAt(index)) && !Character.isDigit(newStr.charAt(index)))
				flag = true;
			else
				break;
		}

		return flag;

	}

	boolean validateNumbers(String str) {
		String arr[] = str.split(" ");
		String newStr = arr[1] + arr[3];
		boolean flag = false;

		for (int index = 0; index < newStr.length(); index++) {
			if (Character.isDigit(newStr.charAt(index)))
				flag = true;
			else
				break;
		}

		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ValidFormat format = new ValidFormat();
		String p1 = "MH 12 BK 4432";
		format.validateFormat(p1);
		String p2 = "MH-12 BK 1432";
		format.validateFormat(p2);
		String p4 = "GJ 05 MK 1123";
		format.validateFormat(p4);
		String p3 = "MH 12-BK 4432";
		format.validateFormat(p3);

	}

}
