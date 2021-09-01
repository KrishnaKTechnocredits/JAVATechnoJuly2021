package varun.varun_string_assignment;

public class ReverseAStringAssignment26 {

	String reversIT(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			output += str.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		ReverseAStringAssignment26 reverseAStringAssignment26 = new ReverseAStringAssignment26();
		String input = "This is technocredits";
		System.out.println(reverseAStringAssignment26.reversIT(input));
	}
}
