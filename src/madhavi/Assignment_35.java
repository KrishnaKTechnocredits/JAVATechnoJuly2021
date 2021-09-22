package madhavi;

public class Assignment_35 {
	void verifyPlateNumber(String plateNumber) {
		if (plateNumber.length() == 13) {
			if (Character.isUpperCase(plateNumber.charAt(0)) && Character.isUpperCase(plateNumber.charAt(1))
					&& Character.isUpperCase(plateNumber.charAt(6)) && Character.isUpperCase(plateNumber.charAt(7))) {
				if (plateNumber.charAt(2) == '-' || plateNumber.charAt(2) == ' ' && plateNumber.charAt(5) == ' '
						&& plateNumber.charAt(8) == ' ') {
					if (Character.isDigit(plateNumber.charAt(3)) && Character.isDigit(plateNumber.charAt(4))
							&& Character.isDigit(plateNumber.charAt(9)) && Character.isDigit(plateNumber.charAt(10))
							&& Character.isDigit(plateNumber.charAt(11)) && Character.isDigit(plateNumber.charAt(12)))
						System.out.println(plateNumber + " is a valid number plate");
					else
						System.out.println(plateNumber + " is a invalid number plate");
				} else
					System.out.println(plateNumber + " is a invalid number plate");
			}
		}
	}

	public static void main(String[] args) {
		Assignment_35 assignment_35 = new Assignment_35();
		String p1 = "MH 12 BK 4432"; // valid
		String p2 = "MH-12 BK 1432"; // valid
		String p4 = "GJ 05 MK 1123"; // Valid
		String p3 = "MH 12-BK 4432";//invalid

		assignment_35.verifyPlateNumber(p1);
		assignment_35.verifyPlateNumber(p2);
		assignment_35.verifyPlateNumber(p3);
		assignment_35.verifyPlateNumber(p4);

	}
}