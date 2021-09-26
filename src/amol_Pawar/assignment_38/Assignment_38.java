package amol_Pawar.assignment_38;

public class Assignment_38 {

	void getStringWithLastHiToFirstGlobant(String input, String startPoint, String endPoint) {
		String output = input.substring(input.lastIndexOf(startPoint), input.indexOf(endPoint) + endPoint.length() + 1);
		System.out.println(output);
	}

	public static void main(String[] args) {
		Assignment_38 assignment_38 = new Assignment_38();
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		String startPoint = "Hi";
		String LastPint = "Globant";
		assignment_38.getStringWithLastHiToFirstGlobant(str, startPoint, LastPint);

	}

}
/*
 * find the substring starting from last hi to first Globant. String str =
 * "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant"; output :
 * Hi Credits Hello GM Neha Globant
 */
