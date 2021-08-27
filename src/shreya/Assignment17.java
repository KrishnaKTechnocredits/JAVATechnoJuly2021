package shreya;
//Reverse of the string is.

public class Assignment17 {
	String getReverseString(String input) {
		String outputString = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			outputString = outputString + input.charAt(index);
		}
		return outputString;

	}

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		System.out.println("Reverse of the string technocredits is  " + assignment17.getReverseString("technocredits"));
	}

}
