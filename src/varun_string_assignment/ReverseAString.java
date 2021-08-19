package varun_string_assignment;

public class ReverseAString {

	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		ReverseAString reverseAString = new ReverseAString();
		String input = "TechNoCredits";
		System.out.println(reverseAString.getReverseString(input));
	}
}
