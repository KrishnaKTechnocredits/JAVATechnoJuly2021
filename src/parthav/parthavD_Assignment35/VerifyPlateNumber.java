package parthav.parthavD_Assignment35;

public class VerifyPlateNumber {

	boolean isValidPlate = false;
	boolean isValidState = false;
	boolean isValidDistrict = false;
	boolean isValidCity = false;
	boolean isValidNumber = false;

	void isValidPlateWith4(String[] inputStr) {
		if (inputStr[0].length() == 2) {

			if ((Character.isUpperCase(inputStr[0].charAt(0))) && Character.isUpperCase(inputStr[0].charAt(1)))
				isValidState = true;
		}

		if (inputStr[1].length() == 2) {

			if ((Character.isDigit(inputStr[1].charAt(0))) && Character.isDigit(inputStr[1].charAt(1)))
				isValidDistrict = true;
		}

		if (inputStr[2].length() == 2) {

			if ((Character.isUpperCase(inputStr[2].charAt(0))) && Character.isUpperCase(inputStr[2].charAt(1)))
				isValidCity = true;
		}

		if (inputStr[3].length() == 4) {

			if ((Character.isDigit(inputStr[3].charAt(0))) && Character.isDigit(inputStr[3].charAt(1))
					&& Character.isDigit(inputStr[3].charAt(2)) && Character.isDigit(inputStr[3].charAt(3)))
				isValidNumber = true;
		}

		if (isValidNumber && isValidCity && isValidDistrict && isValidState)
			isValidPlate = true;

	}

	void isValidPlatewith3(String[] inputStr) {

		if (inputStr[0].length() == 5) {
			if (((Character.isUpperCase(inputStr[0].charAt(0))) && (Character.isUpperCase(inputStr[0].charAt(1))))
					&& (inputStr[0].charAt(2) == '-')) {
				if (Character.isDigit(inputStr[0].charAt(3)) && Character.isDigit(inputStr[0].charAt(4))) {
					isValidDistrict = true;
					isValidState = true;
				}
			}

		} else if (inputStr[0].length() == 2) {
			if (Character.isUpperCase(inputStr[0].charAt(0)) && Character.isUpperCase(inputStr[0].charAt(1))) {
				isValidDistrict = true;
				isValidState = true;
			}
		}

		if (inputStr[1].length() == 2) {
			if (Character.isUpperCase(inputStr[1].charAt(0)) && Character.isUpperCase(inputStr[1].charAt(1)))
				isValidCity = true;
		}

		if (inputStr[2].length() == 4) {
			if ((Character.isDigit(inputStr[2].charAt(0)) && Character.isDigit(inputStr[2].charAt(1)))
					&& (Character.isDigit(inputStr[2].charAt(2)) && Character.isDigit(inputStr[2].charAt(3))))
				isValidNumber = true;

		}
		
		if (isValidNumber && isValidCity && isValidDistrict && isValidState)
			isValidPlate = true;
	}

	void checkValidPlate(String str) {

		String[] inputStr = str.split(" ");
		if (inputStr.length == 4) {
			isValidPlateWith4(inputStr);
		}

		if (inputStr.length == 3)
			isValidPlatewith3(inputStr);

		if (isValidPlate) {
			System.out.println("The number plate: " + str + " is a valid plate");
		} else
			System.out.println("The number plate: " + str + " is an invalid plate");

	}

	public static void main(String[] args) {
		new VerifyPlateNumber().checkValidPlate("MH 12 BK 4422");
		new VerifyPlateNumber().checkValidPlate("MH-12 BK 1432");
		new VerifyPlateNumber().checkValidPlate("GJ 05 MK 1123");
		new VerifyPlateNumber().checkValidPlate("MH 12-BK 4432");

	}

}
