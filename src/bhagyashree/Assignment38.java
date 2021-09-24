package bhagyashree;

/*
 * find the substring starting from last hi to first Globant.  
String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
output : Hi Credits Hello GM Neha Globant

 */

public class Assignment38 {

	String getSubStringFromGiven(String input) {

		String output = input.substring(input.lastIndexOf("Hi"), input.indexOf("Aashvi"));
		return output;
	}

	public static void main(String[] args) {
		Assignment38 ass38 = new Assignment38();
		System.out.println(
				ass38.getSubStringFromGiven("Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant"));
	}

}
