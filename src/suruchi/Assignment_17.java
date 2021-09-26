package suruchi;

public class Assignment_17 {

	String getReverseString(String str) {
		String reverseString = "";
		for (int index = str.length() - 1; index >= 0; index--)
			reverseString += str.charAt(index);
		return reverseString;
	}

	public static void main(String[] args) {
		Assignment_17 assignment_17 = new Assignment_17();

		String str = "technocredits";
		System.out.println("Reverse string for '" + str + "' is: " + assignment_17.getReverseString(str));
	}
}