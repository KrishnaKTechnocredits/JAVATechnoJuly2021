package madhavi;

import java.util.HashMap;

public class Assignment_48_1 {

	private static HashMap<String, String> aadharMap = new HashMap<String, String>();
	private String panCardNumber;

	void genrateAadharNumber(String panCardNumber) {
		if (!aadharMap.containsKey(panCardNumber)) {
			aadharMap.put(panCardNumber, panCardNumber + java.time.Clock.systemUTC().instant());
			System.out.println(
					"Aadhar Number generated successfully for " + panCardNumber + "- " + aadharMap.get(panCardNumber));
		} else {
			System.out.println(
					"Aadhar Number already present for " + panCardNumber + "- " + aadharMap.get(panCardNumber));
		}

	}

	public static void main(String[] args) {
		Assignment_48_1 assignment_48_1 = new Assignment_48_1();
		assignment_48_1.genrateAadharNumber("ABCDE0987A");
		assignment_48_1.genrateAadharNumber("BBCDE1987A");
		assignment_48_1.genrateAadharNumber("AECDE2987A");
		assignment_48_1.genrateAadharNumber("ABFDE0937A");

		assignment_48_1.genrateAadharNumber("ABCDE0987A"); // check for duplication...

	}

}
