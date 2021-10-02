package varun.varun_different_programs;

public class NumberPlateProgrm {
	void getNumberPlate(String numberPlate) {
		if (numberPlate.length() == 13) {
			if (Character.isUpperCase(numberPlate.charAt(0)) && Character.isUpperCase(numberPlate.charAt(1))
					&& Character.isUpperCase(numberPlate.charAt(6)) && Character.isUpperCase(numberPlate.charAt(7))) {
				if (numberPlate.charAt(2) == '-' || numberPlate.charAt(2) == ' ' && numberPlate.charAt(5) == ' '
						&& numberPlate.charAt(8) == ' ') {
					if (Character.isDigit(numberPlate.charAt(3)) && Character.isDigit(numberPlate.charAt(4))
							&& Character.isDigit(numberPlate.charAt(9)) && Character.isDigit(numberPlate.charAt(10))
							&& Character.isDigit(numberPlate.charAt(11)) && Character.isDigit(numberPlate.charAt(12)))
						System.out.println("Valid : Output");
					else
						System.out.println("InValid : Output");
				} else
					System.out.println("InValid : Output");
			} else
				System.out.println("InValid : Output");
		} else
			System.out.println("InValid : Output");

	}

	public static void main(String[] args) {
		NumberPlateProgrm numberPlateProgrm = new NumberPlateProgrm();
		String p1 = "MH 12 BK 4432";
		String p2 = "MH-12 BK 1432";
		String p4 = "GJ 05 MK 1123";
		String p3 = "MH 12-BK 4432";
		System.out.println("Input :" + p1);
		numberPlateProgrm.getNumberPlate(p1);
		System.out.println("-----------------------------------------");

		System.out.println("Input :" + p2);
		numberPlateProgrm.getNumberPlate(p2);
		System.out.println("-----------------------------------------");

		System.out.println("Input :" + p3);
		numberPlateProgrm.getNumberPlate(p3);
		System.out.println("-----------------------------------------");

		System.out.println("Input :" + p4);
		numberPlateProgrm.getNumberPlate(p4);

	}
}
