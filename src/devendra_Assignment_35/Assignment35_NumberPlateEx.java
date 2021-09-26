package devendra_Assignment_35;

public class Assignment35_NumberPlateEx {
	void displayInfo(boolean validNumberPlate) {
		if (validNumberPlate)
			System.out.println("This is Valid Number Plate.");
		else
			System.out.println("This is Not Valid Number Plate.");
	}

	boolean isValidNumberPlate(String numberPlate) {
		boolean isValidPlate = true;
		System.out.println(numberPlate);
		String[] output = numberPlate.split(" ");
		String[] output1 = numberPlate.split("-"); 
		if (output.length == 3) {
			if (numberPlate.charAt(2) == '-') {
				if (isLetter(numberPlate.substring(0, 2)) && isLetter(numberPlate.substring(6, 8))) {
					if (isDigit(numberPlate.substring(3, 5)) && isDigit(numberPlate.substring(9, 12) + 1)) {
						if ((numberPlate.charAt(2) == '-') && (numberPlate.charAt(8) == '-')) {
							isValidPlate = true;
						}	else
							isValidPlate = false;
					}else
						isValidPlate = false;
				} else
					isValidPlate = false;
			} else
				isValidPlate = false;
		}else if (output.length == 4) {
			if (isLetter(numberPlate.substring(0, 2)) && isLetter(numberPlate.substring(6, 8))) {
				if (isDigit(numberPlate.substring(3, 5)) && isDigit(numberPlate.substring(9, 12) + 1)) {
				} else
					isValidPlate = false;
			} else
				isValidPlate = false;
		} else if(output1.length == 2) {
			if ((numberPlate.charAt(2) == '-') && (numberPlate.charAt(8) == '-')) 
			isValidPlate = false;
			}
		return isValidPlate;
	}

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
	
	public static void main(String[] args) {
		String plate1 = "MH 12 BK 4432"; 
		String plate2 = "MH-12 BK 1432"; 
		String plate4 = "GJ 05 MK 1123"; 
		String plate3 = "MH 12-BK 4432"; 
		String plate5 = "MH-12 BK-1432"; 
		Assignment35_NumberPlateEx newObject = new Assignment35_NumberPlateEx();
		newObject.displayInfo(newObject.isValidNumberPlate(plate1));
		System.out.println("------------------------------------");
		newObject.displayInfo(newObject.isValidNumberPlate(plate2));
		System.out.println("------------------------------------");
		newObject.displayInfo(newObject.isValidNumberPlate(plate3));
		System.out.println("------------------------------------");
		newObject.displayInfo(newObject.isValidNumberPlate(plate4));
		System.out.println("------------------------------------");
		newObject.displayInfo(newObject.isValidNumberPlate(plate5));
		System.out.println("------------------------------------");
	}
}
