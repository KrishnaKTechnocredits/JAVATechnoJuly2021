package amol_Pawar.assignment_35;

public class Assignment_35 {

	void getValidNumberPlate(String input) {

		if (input.length() == 13) {
			String str[] = input.split(" ");
			if (((str[0].length() == 2) || (str[0].length() == 5 && input.charAt(2) == 45)) && (str[1].length() == 2)) {
				System.out.println("Given " + input + " String is valid string");

			} else {
				System.out.println("Given " + input + " String is not valid string");
			}
		} else {
			System.out.println("Given " + input + "String is not valid string");
		}
	}

	public static void main(String[] args) {

		Assignment_35 assignment_35 = new Assignment_35();
		String p1 = "MH 12 BK 4432"; // valid
		String p2 = "MH-12 BK 1432"; // valid
		String p3 = "GJ 05 MK 1123"; // Valid
		String p4 = "MH 12-BK 4432"; // invalid

		assignment_35.getValidNumberPlate(p1);
		assignment_35.getValidNumberPlate(p2);
		assignment_35.getValidNumberPlate(p3);
		assignment_35.getValidNumberPlate(p4);

	}

}
