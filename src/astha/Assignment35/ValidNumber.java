/*Assignment - 35 : 16th Sep'2021

Write a program to verify given number plat number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid
*/
package astha.Assignment35;

public class ValidNumber {

	boolean checkValidNumber(String input) {
		System.out.print(input + " : ");
		boolean flag = false;
		String letters = "";
		String numbers = "";
		if (input.length() == 13) {
			if (input.split(" ").length == 4 || input.split(" ").length == 3) {
				if ((input.charAt(2) == ' ' || input.charAt(2) == '-') && input.charAt(5) == ' '
						&& input.charAt(8) == ' ') {
					letters = input.substring(0, 2) + input.substring(6, 8);
					numbers = input.substring(3, 5) + input.substring(9, 13);
					if (isLetters(letters)) {
						if (isNumbers(numbers))
							flag = true;
					} else
						flag = false;
				}

				else
					flag = false;
			} else
				flag = false;
		}
		return flag;
	}

	private boolean isLetters(String input) {
		boolean isLetterFlag = false;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isLetter(input.charAt(index)))
				isLetterFlag = true;
			else {
				isLetterFlag = false;
				break;
			}
		}
		return isLetterFlag;
	}

	private boolean isNumbers(String input) {
		boolean isNumberFlag = false;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				isNumberFlag = true;
			else {
				isNumberFlag = false;
				break;
			}
		}
		return isNumberFlag;
	}

	void displayValidOrInvalid(boolean inputFlag) {
		if (inputFlag) {
			System.out.print("Number is valid");
			System.out.println(" ");
		} else {
			System.out.print("Number is invalid");
			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		ValidNumber validNumber = new ValidNumber();
		validNumber.displayValidOrInvalid(validNumber.checkValidNumber("JH 12 BK 44321111"));
		validNumber.displayValidOrInvalid(validNumber.checkValidNumber("MH 12 BK 4432"));		
		validNumber.displayValidOrInvalid(validNumber.checkValidNumber("MH-12 BK 1432"));
		validNumber.displayValidOrInvalid(validNumber.checkValidNumber("GJ 05 MK 1123"));
		validNumber.displayValidOrInvalid(validNumber.checkValidNumber("MH 12-BK 4432"));
		validNumber.displayValidOrInvalid(validNumber.checkValidNumber("MH#12BK 4 32"));
	}
}
