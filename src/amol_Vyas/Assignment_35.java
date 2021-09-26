/*Write a program to verify given number plate number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid
*/
package amol_Vyas;

public class Assignment_35 {

	private boolean isValidNumberPlate(String input) {
		boolean validNumber = false;
		String[] output = input.split(" ");
		if (output.length == 3 || output.length == 4) {
			if (output.length == 3) {
				if (input.charAt(2) == '-') {
					String letter = input.substring(0, 2) + input.substring(6, 8);
					if (isAllLetter(letter)) {
						String number = input.substring(3, 5) + input.substring(9);
						if (isAllDigit(number)) {
							validNumber = true;
						} else {
							validNumber = false;
						}
					} else {
						validNumber = false;
					}
				} else
					validNumber = false;
			} else if (output.length == 4) {
				String letter = input.substring(0, 2) + input.substring(6, 8);
				if (isAllLetter(letter)) {
					String number = input.substring(3, 5) + input.substring(9);
					if (isAllDigit(number)) {
						validNumber = true;
					} else
						validNumber = false;
				} else
					validNumber = false;
			} else
				validNumber = false;
		}
		return validNumber;
	}

	private boolean isAllLetter(String input) {
		boolean isAllLetter = false;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isLetter(input.charAt(index)) && input.length() == 4) {
				isAllLetter = true;
			} else {
				isAllLetter = false;
				break;
			}
		}
		return isAllLetter;
	}

	private boolean isAllDigit(String input) {
		boolean isAllDigit = false;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)) && input.length() == 6) {
				isAllDigit = true;
			} else {
				isAllDigit = false;
				break;
			}
		}
		return isAllDigit;
	}
	
	void displayValidNumberPlate(String input) {
		if(isValidNumberPlate(input))
			System.out.println(input+" is a valid number plate");
		else
			System.out.println(input+" is not a valid number plate");
	}

	public static void main(String[] args) {
		String p1 = "MH 12 BK 4432";
		String p2 = "MH-12 BK 1432";
		String p4 = "GJ 05 MK 1123";
		String p3 = "MH 12-BK 4432";
		Assignment_35 assignment_35 = new Assignment_35();
		assignment_35.displayValidNumberPlate(p1);
		assignment_35.displayValidNumberPlate(p2);
		assignment_35.displayValidNumberPlate(p3);
		assignment_35.displayValidNumberPlate(p4);
	}
}
