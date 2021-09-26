/*Assignment - 35 : 16th Sep'2021

Write a program to verify given number plat number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid
*/
package shraddha.Assignment35;

public class NumberPlateExample {
	public static void main(String[] args) {
		String plate1 = "MH 12 BK 4432"; // valid
		String plate2 = "MH-12 BK 1432"; // valid
		String plate4 = "GJ 05 MK 1123"; // Valid
		String plate3 = "MH 12-BK 4432"; // invalid
		NumberPlateExample newObject = new NumberPlateExample();
		System.out.println("--------------------------------------");
		newObject.displayInfo(newObject.isValidNumberPlate(plate1));
		System.out.println("--------------------------------------");
		newObject.displayInfo(newObject.isValidNumberPlate(plate2));
		System.out.println("--------------------------------------");
		newObject.displayInfo(newObject.isValidNumberPlate(plate3));
		System.out.println("--------------------------------------");
		newObject.displayInfo(newObject.isValidNumberPlate(plate4));
		System.out.println("--------------------------------------");
	}

	// method to print the information of number plate
	void displayInfo(boolean validNumberPlate) {
		if (validNumberPlate)
			System.out.println("This number plate is valid !!");
		else
			System.out.println("This number plate is not valid !!");
	}

	// method to check if given number plate is valid or not
	boolean isValidNumberPlate(String numberPlate) {
		boolean isValidPlate = true;
		System.out.println(numberPlate);
		String[] output = numberPlate.split(" ");
		if (output.length == 3) {
			if (numberPlate.charAt(2) == '-') {
				if (isLetter(numberPlate.substring(0, 2)) && isLetter(numberPlate.substring(6, 8))) {
					if (isDigit(numberPlate.substring(3, 5)) && isDigit(numberPlate.substring(9, 12) + 1))
						isValidPlate = true;
					else
						isValidPlate = false;
				} else
					isValidPlate = false;
			} else
				isValidPlate = false;
		}
		// String plate4 = "GJ 05 MK 1123"; // Valid
		else if (output.length == 4) {
			if (isLetter(numberPlate.substring(0, 2)) && isLetter(numberPlate.substring(6, 8))) {
				if (isDigit(numberPlate.substring(3, 5)) && isDigit(numberPlate.substring(9, 12) + 1)) {

				} else
					isValidPlate = false;
			} else
				isValidPlate = false;
		} else
			isValidPlate = false;

		return isValidPlate;
	}

	// method to check if all the characters in the given string are
	// letters(alphabets)
	boolean isLetter(String inputString) {
		boolean isLetter = false;
		for (int index = 0; index < inputString.length(); index++) {
			if (Character.isLetter(inputString.charAt(index)))
				isLetter = true;
			else
				isLetter = false;
		}
		return isLetter;
	}

	// method to check if all the characters in the given string are digits(numbers)
	boolean isDigit(String inputString) {
		boolean isDigit = false;
		for (int index = 0; index < inputString.length(); index++) {
			if (Character.isDigit(inputString.charAt(index)))
				isDigit = true;
			else
				isDigit = false;
		}
		return isDigit;
	}

}
