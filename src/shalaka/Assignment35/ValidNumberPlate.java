/*Write a program to verify given number plat number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid
 */
package shalaka.Assignment35;

public class ValidNumberPlate {
	boolean flag = true;

	void isValidLength(String str) {
		if (str.length() == 13) {
			if ((str.charAt(2) == ' ' || str.charAt(2) == '-') && str.charAt(5) == ' ' && str.charAt(8) == ' ') {
				checkValidNumberPlate(str);
			} else
				flag = false;

		} else
			flag = false;

		if (flag)
			System.out.println(str + "  Valid Number plate");
		else
			System.out.println(str + "  invalid number plate");

	}

	boolean checkValidNumberPlate(String str) {
		if (checkIsUpperCase(str.substring(0, 2)) && checkIsUpperCase(str.substring(6, 8))) {
			flag = true;
		} else
			flag = false;
		if (checkIsDigit(str.substring(3, 5)) && checkIsDigit(str.substring(9, str.length()))) {
			flag = true;
		} else
			flag = false;

		if (flag)
			return true;
		else
			return false;

	}

	boolean checkIsDigit(String str) {
		char ch[] = str.toCharArray();
		int count = 0;
		for (int index = 0; index < ch.length; index++) {
			if (Character.isDigit(ch[index]))
				count++;
		}
		if (count == 2 || count == 4)
			return true;
		else
			return false;
	}

	boolean checkIsUpperCase(String str) {
		char ch[] = str.toCharArray();
		int count = 0;
		for (int index = 0; index < ch.length; index++) {
			if (Character.isUpperCase(ch[index])) {
				count++;
			} else
				flag = false;
		}
		if (count == 2) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		String p1 = "MH 12 BK 4432"; // valid
		String p2 = "MH-12 BK 1432"; // valid
		String p3 = "GJ 05 MK 1123"; // Valid
		String p4 = "MH 12-BK 4432"; // invalid

		ValidNumberPlate validNumberPlate = new ValidNumberPlate();
		validNumberPlate.isValidLength(p1);
		validNumberPlate.isValidLength(p2);
		validNumberPlate.isValidLength(p3);
		validNumberPlate.isValidLength(p4);
	}
}
