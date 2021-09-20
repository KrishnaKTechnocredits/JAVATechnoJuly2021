/*
Write a program to verify given number plate number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid
 */

package umakant;

public class Assignment35 {

	boolean isValidNumberPlate(String plateNumber) {
		if (plateNumber.length() == 13) {
			String[] plateNumberParts = plateNumber.split(" ");
			if (plateNumberParts.length == 3) {
				if (plateNumberParts[0].length() == 5) {
					String[] firstPart = plateNumberParts[0].split("-");
					if (firstPart.length == 2) {
						if (firstPart[0].replaceAll("[a-zA-Z]", "").length() != 0 || firstPart[0].length() != 2)
							return false;
						if (firstPart[1].replaceAll("[0-9]", "").length() != 0 || firstPart[1].length() != 2)
							return false;
					} else
						return false;
				} else
					return false;
				if (plateNumberParts[1].replaceAll("[a-zA-Z]", "").length() != 0 || plateNumberParts[1].length() != 2)
					return false;
				if (plateNumberParts[2].replaceAll("[0-9]", "").length() != 0 || plateNumberParts[2].length() != 4)
					return false;
			} else if (plateNumberParts.length == 4) {
				if (plateNumberParts[0].replaceAll("[a-zA-Z]", "").length() != 0 || plateNumberParts[0].length() != 2)
					return false;
				if (plateNumberParts[1].replaceAll("[0-9]", "").length() != 0 || plateNumberParts[1].length() != 2)
					return false;
				if (plateNumberParts[2].replaceAll("[a-zA-Z]", "").length() != 0 || plateNumberParts[2].length() != 2)
					return false;
				if (plateNumberParts[3].replaceAll("[0-9]", "").length() != 0 || plateNumberParts[3].length() != 4)
					return false;

			} else
				return false;
		} else
			return false;
		return true;
	}

	void displayValidOrInvalidNumberPlate(String input) {
		if (isValidNumberPlate(input))
			System.out.println(input + ":Valid");
		else
			System.out.println(input + ":InValid");
	}

	public static void main(String[] args) {
		Assignment35 assignment = new Assignment35();
		String p1 = "MH 12 BK 4432"; // valid
		String p2 = "MH-12 BK 1432"; // valid
		String p3 = "GJ 05 MK 1123"; // Valid
		String p4 = "MH 12-BK 4432"; // invalid
		assignment.displayValidOrInvalidNumberPlate(p1);
		assignment.displayValidOrInvalidNumberPlate(p2);
		assignment.displayValidOrInvalidNumberPlate(p3);
		assignment.displayValidOrInvalidNumberPlate(p4);
	}

}
